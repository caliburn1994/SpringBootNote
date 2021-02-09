#!/usr/bin/env bash
echo "installing PostgreSQL..."


# parameters
POSTGRES_K8S_BASENAME="psql-cluster" && export POSTGRES_K8S_BASENAME
POSTGRES_K8S_SERVICE="${POSTGRES_K8S_BASENAME}-postgresql" && export POSTGRES_K8S_SERVICE


# root dir and dependencies
if [[ -z "${SpringBootNote_path}" ]]; then
  SpringBootNote_path="$(cd "$(dirname "${BASH_SOURCE[0]}")"/../../.. >/dev/null 2>&1 && pwd)"
fi
. "${SpringBootNote_path}/script/color.sh"



# install
if ! kubectl get service "${POSTGRES_K8S_SERVICE}" &>/dev/null; then
  # shellcheck disable=SC2154
  echo "${pink}If helm version<3.1, use => helm install ${POSTGRES_K8S_BASENAME} bitnami/postgresql --version 10.2.2 ${reset}"
  echo "${pink}If helm version>3.1, use => helm install ${POSTGRES_K8S_BASENAME} bitnami/postgresql ${reset}"

  helm repo add bitnami https://charts.bitnami.com/bitnami
  helm install ${POSTGRES_K8S_BASENAME} bitnami/postgresql --version 10.2.2
fi
kubectl port-forward --namespace default svc/psql-cluster-postgresql 5432:5432 &



# output result
POSTGRES_PASSWORD="$(kubectl get secret --namespace default ${POSTGRES_K8S_SERVICE} -o jsonpath="{.data.postgresql-password}" | base64 --decode)"
export POSTGRES_PASSWORD
export POSTGRES_USERNAME="postgres"
export POSTGRES_URL="jdbc:postgresql://localhost:5432/postgres"

cat <<EOF >>"${SpringBootNote_path}/config/psql.properties"
url=${POSTGRES_URL}
username=${POSTGRES_USERNAME}
password=${POSTGRES_PASSWORD}
EOF


