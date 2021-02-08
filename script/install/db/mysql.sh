#!/usr/bin/env bash
# "bitnami" has been added to your repositories
#NAME: my-release
#LAST DEPLOYED: Fri Jan 22 00:22:19 2021
#NAMESPACE: default
#STATUS: deployed
#REVISION: 1
#TEST SUITE: None
#NOTES:
#** Please be patient while the chart is being deployed **
#
#Tip:
#
#  Watch the deployment status using the command: kubectl get pods -w --namespace default
#
#Services:
#
#  echo Primary: my-release-mysql.default.svc.cluster.local:3306
#
#Administrator credentials:
#
#  echo Username: root
#  echo Password : $(kubectl get secret --namespace default my-release-mysql -o jsonpath="{.data.mysql-root-password}" | base64 --decode)
#
#To connect to your database:
#
#  1. Run a pod that you can use as a client:
#
#      kubectl run my-release-mysql-client --rm --tty -i --restart='Never' --image  docker.io/bitnami/mysql:8.0.23-debian-10-r0 --namespace default --command -- bash
#
#  2. To connect to primary service (read/write):
#
#      mysql -h my-release-mysql.default.svc.cluster.local -uroot -p my_database
#
#To upgrade this helm chart:
#
#  1. Obtain the password as described on the 'Administrator credentials' section and set the 'root.password' parameter as shown below:
#
#      ROOT_PASSWORD=$(kubectl get secret --namespace default my-release-mysql} -o jsonpath="{.data.mysql-root-password}" | base64 --decode)
#      helm upgrade my-release bitnami/mysql --set auth.rootPassword=$ROOT_PASSWORD
set -e
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


install

echo "mysql -h my-release-mysql.default.svc.cluster.local -uroot -p my_database"
echo "Username: root"
echo "Password: $(kubectl get secret --namespace default ${container_name} -o jsonpath="{.data.mysql-root-password}" | base64 --decode)"