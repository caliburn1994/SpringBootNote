set -e
if [[ -z "${SpringBootNote_path}" ]]; then
  SpringBootNote_path="$( cd "$( dirname "${BASH_SOURCE[0]}")"/../../.. >/dev/null 2>&1 && pwd )"
fi
. "${SpringBootNote_path}/script/deploy/k8s/helm.sh"

# https://docs.gitlab.com/charts/development/minikube/
function install() {
  helm repo add gitlab https://charts.gitlab.io/
  helm repo update


  helm upgrade --install gitlab gitlab/gitlab  \
    --timeout 600s \
    --set global.hosts.domain="$(minikube ip).nip.io" \
    --set global.hosts.externalIP="$(minikube ip)" \
    --set global.hosts.externalIP="$(minikube ip)" \
    -f ./values-minikube.yaml

    echo "user: root"
    echo "password:"
    kubectl get secret gitlab-gitlab-initial-root-password -ojsonpath='{.data.password}' | base64 --decode ; echo
}


install