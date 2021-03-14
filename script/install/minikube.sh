#!/usr/bin/env bash

# set root dir
# import color dependencies
if [[ -z "${PROJECT_ROOT_PATH}" ]]; then
  PROJECT_ROOT_PATH="$(cd "$(dirname "${BASH_SOURCE[0]}")"/../.. >/dev/null 2>&1 && pwd)"
fi
. "${PROJECT_ROOT_PATH}/script/color.sh"


echo "${pink}Checking minikube...${reset}"
# install docker
if ! type -p docker &>/dev/null; then
  echo "${pink}Installing docker...${reset}"

  # https://docs.docker.com/engine/install/ubuntu/
  sudo apt-get update
  sudo apt-get install -y \
    apt-transport-https \
    ca-certificates \
    curl \
    gnupg-agent \
    software-properties-common
  curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
  sudo apt-key fingerprint 0EBFCD88

  sudo add-apt-repository \
    "deb [arch=amd64] https://download.docker.com/linux/ubuntu \
   $(lsb_release -cs) \
   stable"
  sudo apt-get update
  sudo apt-get install -y docker-ce docker-ce-cli containerd.io

  # test
  sudo docker run hello-world
fi

if ! groups | grep docker &>/dev/null; then
  echo "${green}Adding current user to docker group... ${reset}"
  # add the current user to docker group
  sudo groupadd docker
  sudo usermod -aG docker "${USER}"

  echo "${green}Please reboot or re-login ${USER} ${reset}"
fi

# install kubectl
if ! type -p kubectl &>/dev/null; then
  echo "${pink}Installing kubectl...${reset}"

  curl -LO https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/linux/amd64/kubectl
  chmod +x ./kubectl
  sudo mv ./kubectl /usr/local/bin/kubectl
  kubectl version --client

  # auto completion
  # shellcheck disable=SC1090
  source <(kubectl completion bash)
  echo "source <(kubectl completion bash)" >>~/.bashrc
fi

# install minikube
# https://minikube.sigs.k8s.io/docs/start/
if ! type -p minikube &>/dev/null; then
  echo "${pink}Installing minikube...${reset}"

  curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube_latest_amd64.deb
  sudo dpkg -i minikube_latest_amd64.deb
  rm minikube_latest_amd64.deb

  # auto completion
  # shellcheck disable=SC1090
  source <(minikube completion bash)
  echo "source <(minikube completion bash)" >>~/.bashrc

  minikube addons enable ingress

  # run minikube when boot up
  SERVICE_CONFIG_LOCATION="${PROJECT_ROOT_PATH}/config/minibube/minibube-custom.service"
  SERVICE_CONFIG_TEMPLATE_LOCATION="${PROJECT_ROOT_PATH}/config/minibube/minibube-custom-template.service"
  envsubst < "${SERVICE_CONFIG_TEMPLATE_LOCATION}" > "${SERVICE_CONFIG_LOCATION}"
  sudo cp "${SERVICE_CONFIG_LOCATION}"  /etc/systemd/system/
  sudo systemctl daemon-reload
  sudo systemctl enable minibube-custom.service
  sudo systemctl start minibube-custom.service
fi