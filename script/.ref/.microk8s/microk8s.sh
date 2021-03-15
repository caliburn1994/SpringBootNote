#!/usr/bin/env bash

# root dir
if [[ -z "${PROJECT_ROOT_PATH}" ]]; then
  PROJECT_ROOT_PATH="$( cd "$( dirname "${BASH_SOURCE[0]}")"/../.. >/dev/null 2>&1 && pwd )"
fi
. "${PROJECT_ROOT_PATH}/script/common.sh"


# https://microk8s.io/
if ! type -p microk8s &>/dev/null; then
  sudo snap install microk8s --classic
  sudo usermod -aG microk8s "${USER}"
  sudo chown -f -R "${USER}" ~/.kube

  su ${USER} # re-login
  microk8s enable dashboard dns registry istio helm3 rbac ingress # todo https://istio.io/latest/zh/docs/concepts/what-is-istio/
  microk8s enable metallb # todo

  # helm`
  if microk8s helm &>/dev/null; then
      sudo snap alias microk8s.helm3 helm
      # shellcheck disable=SC1090
      source <(helm completion bash)
      echo "source <(helm completion bash)" >>~/.bashrc

      # shellcheck disable=SC2154
      helm init  || echo "${red}failed to initialize helm${reset}"
  fi

  # kubectl
  sudo snap alias microk8s.kubectl kubectl
  # shellcheck disable=SC1090
  source <(kubectl completion bash)
  echo "source <(kubectl completion bash)" >>~/.bashrc
fi

microk8s dashboard-proxy &