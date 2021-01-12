#!/usr/bin/env bash

. "$(dirname "$0")"/color.sh
set -e


install() {
  # shellcheck disable=SC2154
  echo "${green}Updating and adding repository ${reset}"

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


  echo "${green}Installing docker${reset}"
  sudo apt-get install -y docker-ce docker-ce-cli containerd.io

  # test
  sudo docker run hello-world

  # add the current user to docker group
  sudo groupadd docker
  sudo usermod -aG docker $USER

# todo  稍后修改

  # expose docker to tcp://127.0.0.1:2375
  # https://docs.docker.com/engine/install/linux-postinstall/
#  sudo tee /usr/lib/systemd/system/docker.service <<-'EOF'
#[Service]
#ExecStart=
#ExecStart=/usr/bin/dockerd -H unix:// -H tcp://127.0.0.1:2375
#EOF
#  sudo systemctl daemon-reload

#  newgrp docker
#  docker run hello-world
}

#if ! which docker>/dev/null ; then
  install
#fi
