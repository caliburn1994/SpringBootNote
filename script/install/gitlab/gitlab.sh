#!/usr/bin/env bash

# root dir and dependencies
if [[ -z "${SpringBootNote_path}" ]]; then
  SpringBootNote_path="$(cd "$(dirname "${BASH_SOURCE[0]}")"/../../.. >/dev/null 2>&1 && pwd)"
fi
. "${SpringBootNote_path}/script/color.sh"
. "${SpringBootNote_path}/script/install/db/psql.sh"

# https://docs.gitlab.com/charts/development/minikube/
if ! kubectl get pods | grep gitlab &>/dev/null; then
  helm repo add gitlab https://charts.gitlab.io/
  helm repo update

  # ip could be:
  # - $(kubectl get nodes -o jsonpath='{.items[0].status.addresses[?(@.type=="InternalIP")].address}')
  # - $(minikube ip)
  ip="$(minikube ip)"

  config_file="${SpringBootNote_path}/config/gitlab.yaml"
  cat <<EOF >"$config_file"
# values-minikube.yaml
# This example intended as baseline to use Minikube for the deployment of GitLab
# - Services that are not compatible with how Minikube runs are disabled
# - Configured to use 192.168.99.100, and nip.io for the domain

# Minimal settings
global:
  ingress:
    configureCertmanager: false
    class: "nginx"
  hosts:
    domain: "${ip}.nip.io"
    externalIP: "${ip}"
  rails:
    bootsnap:
      enabled: false
  shell:
    # Configure the clone link in the UI to include the high-numbered NodePort
    # value from below (gitlab.gitlab-shell.service.nodePort)
    port: 32022
  psql:
    host: ${POSTGRES_K8S_SERVICE}
    database: postgres
    username: postgres
    password:
      secret: ${POSTGRES_K8S_SERVICE}
      key: postgresql-password
# Don't use certmanager, we'll self-sign
certmanager:
  install: false
# Use the "ingress" addon, not our Ingress (can't map 22/80/443)
nginx-ingress:
  enabled: false
# Save resources, only 3 CPU
prometheus:
  install: false
gitlab-runner:
  install: false
# Reduce replica counts, reducing CPU & memory requirements
gitlab:
  webservice:
    minReplicas: 1
    maxReplicas: 1
  sidekiq:
    minReplicas: 1
    maxReplicas: 1
  gitlab-shell:
    minReplicas: 1
    maxReplicas: 1
    # Map gitlab-shell to a high-numbered NodePort to support cloning over SSH since
    # Minikube takes port 22.
    service:
      type: NodePort
      nodePort: 32022
registry:
  hpa:
    minReplicas: 1
    maxReplicas: 1
EOF

  helm upgrade --install gitlab gitlab/gitlab \
    --timeout 600s \
    -f "$config_file"

  #    --set postgresql.install=false \
  #    --set global.psql.host=${POSTGRES_K8S_SERVICE} \
  #    --set global.psql.password.secret=${POSTGRES_K8S_SERVICE} \
  #    --set global.psql.database.secret=postgres \
  #    --set global.psql.password.key=postgresql-password \

  # shellcheck disable=SC2154
  echo "${pink}user: root"
  echo "password: $(
    kubectl get secret gitlab-gitlab-initial-root-password -ojsonpath='{.data.password}' | base64 --decode
    echo
  )"
  # shellcheck disable=SC2154
  echo "site: https://gitlab.${ip}.nip.io ${reset}"
fi

# check gitlab if normal
rsl=$(kubectl get ingress -o jsonpath='{.items[0].status.loadBalancer.ingress[0].ip}')
if [ $? -ne 0 ] && [ ! "$rsl" ]; then
  # shellcheck disable=SC2154
  echo "${red}❌ Do you enable the minikube plugin ingress? like this"
  echo "minikube addons enable ingress${reset}"
fi
