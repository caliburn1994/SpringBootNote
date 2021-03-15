#!/usr/bin/env bash

# root dir and dependencies
if [[ -z "${PROJECT_ROOT_PATH}" ]]; then
  PROJECT_ROOT_PATH="$(cd "$(dirname "${BASH_SOURCE[0]}")"/../.. >/dev/null 2>&1 && pwd)"
fi
. "${PROJECT_ROOT_PATH}/script/common.sh"
. "${PROJECT_ROOT_PATH}/script/install/db/psql.sh"

# https://docs.gitlab.com/charts/development/minikube/
function install() {
  helm repo add gitlab https://charts.gitlab.io/
  helm repo update

  ip=$(kubectl get nodes -o jsonpath='{.items[0].status.addresses[?(@.type=="InternalIP")].address}')

  echo ${pink}
  echo ${ip}
  echo ${POSTGRES_K8S_SERVICE}
  echo "${reset}"

  helm upgrade --install gitlab gitlab/gitlab  \
    --version 4.6.6 \
    --set global.hosts.domain="${ip}.nip.io" \
    --set global.hosts.externalIP="${ip}" \
    --timeout 600s \
    -f ./gitlab.yaml


#    --set postgresql.install=false \
#    --set global.psql.host=${POSTGRES_K8S_SERVICE} \
#    --set global.psql.password.secret=${POSTGRES_K8S_SERVICE} \
#    --set global.psql.password.key=postgresql-password \


#  echo "user: root
#  password: $(kubectl get secret gitlab-gitlab-initial-root-password -ojsonpath='{.data.password}' | base64 --decode ; echo)
#  site: https://gitlab.${ip}.nip.io"
}

install
