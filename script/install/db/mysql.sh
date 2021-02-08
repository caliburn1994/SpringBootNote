#!/usr/bin/env bash
echo "installing mysql..."

# root dir
if [[ -z "${SpringBootNote_path}" ]]; then
  SpringBootNote_path="$( cd "$( dirname "${BASH_SOURCE[0]}")"/../../.. >/dev/null 2>&1 && pwd )"
fi
. "${SpringBootNote_path}/script/color.sh"


container_name="mysql-cluster"

function install() {
  # shellcheck disable=SC2154
  echo "${pink}If helm version<3.1, use => helm install ${container_name} bitnami/mysql --version 8.2.5${reset}"
  echo "${pink}If helm version>3.1, use => helm install ${container_name} bitnami/mysql${reset}"

  helm repo add bitnami https://charts.bitnami.com/bitnami
  # shellcheck disable=SC2154
  helm install ${container_name} bitnami/mysql --version 8.2.5 || echo "${red}fail to install mysql...${reset}"
}

if ! kubectl get service ${container_name} &>/dev/null; then
    install
fi
kubectl port-forward service/${container_name} 3306:3306


password="$(kubectl get secret --namespace default ${container_name} -o jsonpath="{.data.mysql-root-password}" | base64 --decode)"
cat << EOF > "${SpringBootNote_path}/config/mysql.properties"
url=jdbc:mysql://localhost:3306
username=root
password=${password}
EOF