#!/usr/bin/env bash

# constant
PROJECT_ROOT_PATH="$(cd "$(dirname "${BASH_SOURCE[0]}")"/../../.. >/dev/null 2>&1 && pwd)"
CURRENT_DIR=$(dirname "$0")
CONTAINER_NAME="mysql-cluster"

# dependencies
. "${PROJECT_ROOT_PATH}/script/common.sh"

echo_info "Running ${CURRENT_DIR}"
# install
if ! kubectl get service ${CONTAINER_NAME} &>/dev/null; then
  echo_debug "If helm version<3.1, use => helm install ${CONTAINER_NAME} bitnami/mysql --version 8.2.5"
  echo_debug "If helm version>3.1, use => helm install ${CONTAINER_NAME} bitnami/mysql"

  helm repo add bitnami https://charts.bitnami.com/bitnami
  # shellcheck disable=SC2154
  helm install ${CONTAINER_NAME} bitnami/mysql --version 8.2.5 || echo "${red}fail to install mysql...${reset}"
fi
kubectl port-forward service/${CONTAINER_NAME} 3306:3306 &


# output result
password="$(kubectl get secret --namespace default ${CONTAINER_NAME} -o jsonpath="{.data.mysql-root-password}" | base64 --decode)"
cat <<EOF > "${PROJECT_ROOT_PATH}/config/db/mysql.properties"
url=jdbc:mysql://localhost:3306
username=root
password=${password}
EOF
