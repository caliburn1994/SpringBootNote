#!/usr/bin/env bash
# ubuntu 20
set -e

# constant
PROJECT_ROOT_PATH="$(cd "$(dirname "${BASH_SOURCE[0]}")"/.. >/dev/null 2>&1 && pwd)"
CURRENT_DIR=$(dirname "$0")

# dependencies
. "${PROJECT_ROOT_PATH}/script/common.sh"

echo_info "Running ${CURRENT_DIR}"
function install_desktop_apps() {
  # for logitech keyboard and mouse
  sudo apt-get install -y solaar
  # pinyin
  sudo apt-get install -y ibus-sunpinyin
  ibus restart
  # office
  sudo snap install notepad-plus-plus # notepad++
  # typora
  # https://support.typora.io/Typora-on-Linux/
  if ! type -p typora &>/dev/null; then
    wget -qO - https://typora.io/linux/public-key.asc | sudo apt-key add -
    # add Typora's repository
    sudo add-apt-repository 'deb https://typora.io/linux ./'
    sudo apt-get update
    # install typora
    sudo apt-get install typora
  fi
  # chrome
  if ! type -p google-chrome &>/dev/null; then
    wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
    sudo apt install ./google-chrome-stable_current_amd64.deb && rm ./google-chrome-stable_current_amd64.deb
  fi
}
function install_tools() {
  # system
  sudo apt-get install -y openssh-server git make curl vim net-tools jq

  # development tools
  sudo apt-get install -y npm
  bash "${PROJECT_ROOT_PATH}/script/install/java.sh"

  # local cloud
  bash "${PROJECT_ROOT_PATH}/script/install/helm.sh"
  bash "${PROJECT_ROOT_PATH}/script/install/minikube/minikube.sh"
  # database in cloud
  #bash "${PROJECT_ROOT_PATH}/script/install/db/mysql.sh"
  # application in cloud
  bash "${PROJECT_ROOT_PATH}/script/install/gitlab/gitlab.sh"
}

install_desktop_apps
install_tools
