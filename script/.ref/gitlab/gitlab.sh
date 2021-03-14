set -e
if [[ -z "${PROJECT_ROOT_PATH}" ]]; then
  PROJECT_ROOT_PATH="$( cd "$( dirname "${BASH_SOURCE[0]}")"/../../.. >/dev/null 2>&1 && pwd )"
fi
. "${PROJECT_ROOT_PATH}/script/deploy/k8s/helm.sh"

# https://docs.gitlab.com/charts/development/minikube/
function install() {
  helm repo add gitlab https://charts.gitlab.io/
  helm repo update


  helm upgrade --install gitlab gitlab/gitlab  \
    --timeout 600s \
    --set global.hosts.domain="$(minikube ip).nip.io" \
    --set global.hosts.externalIP="$(minikube ip)" \
    -f ./values-minikube.yaml

  echo "user: root
  password: $(kubectl get secret gitlab-gitlab-initial-root-password -ojsonpath='{.data.password}' | base64 --decode ; echo)
  site: https://gitlab.$(minikube ip).nip.io"
}

install
