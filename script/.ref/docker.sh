#!/usr/bin/env bash
set -e
if [[ -z "${PROJECT_ROOT_PATH}" ]]; then
  PROJECT_ROOT_PATH="$( cd "$( dirname "${BASH_SOURCE[0]}")"/../.. >/dev/null 2>&1 && pwd )"
fi
. "${PROJECT_ROOT_PATH}/script/color.sh"
green=green
reset=reset


if ! type -p docker &>/dev/null; then
  echo "${green}Installing docker... ${reset}"

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

if ! groups | grep docker &>/dev/null ; then
  echo "${green}Adding current user to docker group... ${reset}"
  # add the current user to docker group
  sudo groupadd docker
  sudo usermod -aG docker "${USER}"
fi

  # todo  稍后查看tcp
  # expose docker to tcp://127.0.0.1:2375
  # https://docs.docker.com/engine/install/linux-postinstall/
#  sudo tee /usr/lib/systemd/system/docker.service <<-'EOF'
#[Service]
#ExecStart=
#ExecStart=/usr/bin/dockerd -H unix:// -H tcp://127.0.0.1:2375
#EOF
#  sudo systemctl daemon-reload
#  newgrp docker

