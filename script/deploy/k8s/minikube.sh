#!/usr/bin/env bash
set -e

# install kubectl
if ! type -p kubectl &>/dev/null; then

  curl -LO https://storage.googleapis.com/kubernetes-release/release/`curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt`/bin/linux/amd64/kubectl
  chmod +x ./kubectl
  sudo mv ./kubectl /usr/local/bin/kubectl
  kubectl version --client
fi

# install minikube
# https://minikube.sigs.k8s.io/docs/start/
if ! type -p minikube &>/dev/null; then
  curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube_latest_amd64.deb
  sudo dpkg -i minikube_latest_amd64.deb
  rm minikube_latest_amd64.deb
fi



