#!/usr/bin/env bash
set -e

if [[ -z "${SpringBootNote_path}" ]]; then
  SpringBootNote_path="$( cd "$( dirname "${BASH_SOURCE[0]}")"/../../.. >/dev/null 2>&1 && pwd )"
fi
. "${SpringBootNote_path}/script/deploy/docker.sh"

# install kubectl
if ! type -p kubectl &>/dev/null; then

  curl -LO https://storage.googleapis.com/kubernetes-release/release/`curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt`/bin/linux/amd64/kubectl
  chmod +x ./kubectl
  sudo mv ./kubectl /usr/local/bin/kubectl
  kubectl version --client

  # auto completion
  # shellcheck disable=SC1090
  source <(kubectl completion bash)
  echo "source <(kubectl completion bash)" >> ~/.bashrc
fi

# install minikube
# https://minikube.sigs.k8s.io/docs/start/
if ! type -p minikube &>/dev/null; then
  curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube_latest_amd64.deb
  sudo dpkg -i minikube_latest_amd64.deb
  rm minikube_latest_amd64.deb

  minikube addons enable ingress
fi

minikube start
minikube dashboard

