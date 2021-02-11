#!/usr/bin/env bash
# ubuntu 20

if [[ -z "${SpringBootNote_path}" ]]; then
  SpringBootNote_path="$( cd "$( dirname "${BASH_SOURCE[0]}")"/.. >/dev/null 2>&1 && pwd )"
fi
. "${SpringBootNote_path}/script/color.sh"


# for logitech keyboard and mouse
sudo apt-get install -y solaar
sudo apt-get install -y solaar-gnome

# system
sudo apt install -y openssh-server
sudo apt-get install -y git
sudo apt install -y make
sudo apt-get install -y -y curl
sudo apt-get install -y vim
sudo apt install -y net-tools

# office
sudo snap install notepad-plus-plus  # notepad++
# https://support.typora.io/Typora-on-Linux/
if ! type -p typora &>/dev/null; then
  wget -qO - https://typora.io/linux/public-key.asc | sudo apt-key add -
  # add Typora's repository
  sudo add-apt-repository 'deb https://typora.io/linux ./'
  sudo apt-get update
  # install typora
  sudo apt-get install typora
fi

# development tools
bash  ${SpringBootNote_path}/script/install/java.sh

# local cloud
bash  ${SpringBootNote_path}/script/install/helm.sh
bash  ${SpringBootNote_path}/script/install/minikube.sh

# app
bash ${SpringBootNote_path}/script/install/db/mysql.sh


# web
#   front-end service
sudo apt install -Y npm
