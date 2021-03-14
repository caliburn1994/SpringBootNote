#!/usr/bin/env bash

# root dir and dependencies
if [[ -z "${PROJECT_ROOT_PATH}" ]]; then
  PROJECT_ROOT_PATH="$(cd "$(dirname "${BASH_SOURCE[0]}")"/../../.. >/dev/null 2>&1 && pwd)"
fi
. "${PROJECT_ROOT_PATH}/script/color.sh"
. "${PROJECT_ROOT_PATH}/script/install/db/psql.sh"

# https://docs.gitlab.com/charts/development/minikube/
if ! kubectl get pods | grep gitlab &>/dev/null; then
  helm repo add gitlab https://charts.gitlab.io/
  helm repo update

  # ip could be:
  # - $(kubectl get nodes -o jsonpath='{.items[0].status.addresses[?(@.type=="InternalIP")].address}')
  # - $(minikube ip)
  ip="$(minikube ip)"
  export ip

  CONFIG_FILE_LOCATION="./gitlab.yaml"
  CONFIG_FILE_TEMPLATE_LOCATION="./gitlab-template.yaml"
  envsubst < "${CONFIG_FILE_TEMPLATE_LOCATION}" > "${CONFIG_FILE_LOCATION}"

  helm upgrade --install gitlab gitlab/gitlab \
    --timeout 600s \
    -f "$CONFIG_FILE_LOCATION"


  cat << EOF > "${PROJECT_ROOT_PATH}/config/bin/open-gitlab.sh"
#!/usr/bin/env bash
echo "user: root"
echo password: $(
    kubectl get secret gitlab-gitlab-initial-root-password -ojsonpath='{.data.password}' | base64 --decode
    echo
  )
xdg-open https://gitlab.${ip}.nip.io
EOF

fi

# check gitlab if normal
rsl=$(kubectl get ingress -o jsonpath='{.items[0].status.loadBalancer.ingress[0].ip}')
if [ $? -ne 0 ] && [ ! "$rsl" ]; then
  # shellcheck disable=SC2154
  echo "${red}❌ Do you enable the minikube plugin ingress? like this"
  echo "minikube addons enable ingress${reset}"
fi
