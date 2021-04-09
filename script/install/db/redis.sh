#!/usr/bin/env bash

# constant
PROJECT_ROOT_PATH="$(cd "$(dirname "${BASH_SOURCE[0]}")"/../../.. >/dev/null 2>&1 && pwd)"
CURRENT_DIR=$(dirname "$0")
POSTGRES_K8S_BASENAME="psql-cluster" && export POSTGRES_K8S_BASENAME
POSTGRES_K8S_SERVICE="${POSTGRES_K8S_BASENAME}-postgresql" && export POSTGRES_K8S_SERVICE
SERVICE_CONFIG_FILENAME="minikube-psql"
SERVICE_CONFIG_TEMPLATE_LOCATION="${CURRENT_DIR}/${SERVICE_CONFIG_FILENAME}-template.service"
SERVICE_CONFIG_LOCATION="${CURRENT_DIR}/${SERVICE_CONFIG_FILENAME}.service"

# dependencies
. "${PROJECT_ROOT_PATH}/script/common.sh"

echo_info "Running $(basename "$0")"


# https://github.com/bitnami/charts/tree/master/bitnami/redis-cluster
helm install --timeout 600s myrelease bitnami/redis-cluster

