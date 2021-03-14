#!/usr/bin/env bash

# parameters
container_name="mysql-cluster"

# root dir and dependencies
if [[ -z "${PROJECT_ROOT_PATH}" ]]; then
  PROJECT_ROOT_PATH="$(cd "$(dirname "${BASH_SOURCE[0]}")"/../../.. >/dev/null 2>&1 && pwd)"
fi
. "${PROJECT_ROOT_PATH}/script/color.sh"


echo "${pink}Checking mysql...${reset}"

# install
if ! kubectl get service ${container_name} &>/dev/null; then
  # shellcheck disable=SC2154
  echo "${pink}If helm version<3.1, use => helm install ${container_name} bitnami/mysql --version 8.2.5${reset}"
  echo "${pink}If helm version>3.1, use => helm install ${container_name} bitnami/mysql${reset}"

  helm repo add bitnami https://charts.bitnami.com/bitnami
  # shellcheck disable=SC2154
  helm install ${container_name} bitnami/mysql --version 8.2.5 || echo "${red}fail to install mysql...${reset}"
fi
kubectl port-forward service/${container_name} 3306:3306 &


# output result
password="$(kubectl get secret --namespace default ${container_name} -o jsonpath="{.data.mysql-root-password}" | base64 --decode)"
cat <<EOF > "${PROJECT_ROOT_PATH}/config/db/mysql.properties"
url=jdbc:mysql://localhost:3306
username=root
password=${password}
EOF
