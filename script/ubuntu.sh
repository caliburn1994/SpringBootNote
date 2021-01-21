#!/usr/bin/env bash
# ubuntu 20

# for logitech keyboard and mouse
sudo apt-get install -y solaar
sudo apt-get install -y solaar-gnome

# git
sudo apt-get install -y git

# ssh
sudo apt install -y openssh-server

# others
sudo apt install -y make
sudo apt-get install -y -y curl
sudo apt-get install -y vim
sudo snap install notepad-plus-plus  # notepad++

# https://support.typora.io/Typora-on-Linux/
wget -qO - https://typora.io/linux/public-key.asc | sudo apt-key add -
# add Typora's repository
sudo add-apt-repository 'deb https://typora.io/linux ./'
sudo apt-get update
# install typora
sudo apt-get install typora