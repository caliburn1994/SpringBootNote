#!/usr/bin/env bash

# install kubectl
if ! type -p kubectl &>/dev/null; then

  curl -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/linux/amd64/kubectl
  chmod +x ./kubectl
  sudo mv ./kubectl /usr/local/bin/kubectl
  kubectl version --client

  # auto completion
  # shellcheck disable=SC1090
  source <(kubectl completion bash)
  echo "source <(kubectl completion bash)" >>~/.bashrc
fi

# https://microk8s.io/
if ! type -p microk8s &>/dev/null; then
  sudo snap install microk8s --classic
  sudo usermod -aG microk8s ${USER}
  sudo chown -f -R ${USER} ~/.kube

  su ${USER} # re-login

  microk8s status --wait-ready
  if [ $? -eq 0 ]; then
    # todo https://istio.io/latest/zh/docs/concepts/what-is-istio/
    microk8s enable dashboard dns registry istio
  else
    echo "failed to install "
  fi
fi

echo "
Access dashboard by:

    microk8s dashboard-proxy
"