#!/usr/bin/env bash

# root dir and dependencies
if [[ -z "${SpringBootNote_path}" ]]; then
  SpringBootNote_path="$(cd "$(dirname "${BASH_SOURCE[0]}")"/../../.. >/dev/null 2>&1 && pwd)"
fi
. "${SpringBootNote_path}/script/color.sh"
. "${SpringBootNote_path}/script/install/db/psql.sh"  # todo





# https://docs.gitlab.com/charts/development/minikube/
if ! kubectl get pods | grep gitlab &>/dev/null; then
  helm repo add gitlab https://charts.gitlab.io/
  helm repo update

  # ip could be:
  # - $(kubectl get nodes -o jsonpath='{.items[0].status.addresses[?(@.type=="InternalIP")].address}')
  # - $(minikube ip)
  ip="$(minikube ip)"
  helm upgrade --install gitlab gitlab/gitlab  \
    --timeout 600s \
    --set global.hosts.domain="${ip}.nip.io" \
    --set global.hosts.externalIP="${ip}" \
    -f ./gitlab.yaml


  #    --set postgresql.install=false \
  #    --set global.psql.host=${POSTGRES_K8S_SERVICE} \
  #    --set global.psql.password.secret=${POSTGRES_K8S_SERVICE} \
  #    --set global.psql.password.key=postgresql-password \


    # shellcheck disable=SC2154
    echo "${pink}user: root"
    echo "password: $(kubectl get secret gitlab-gitlab-initial-root-password -ojsonpath='{.data.password}' | base64 --decode ; echo)"
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