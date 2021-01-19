#!/usr/bin/env bash

# https://helm.sh/zh/
if ! type -p helm &>/dev/null; then
  sudo snap install helm --classic
  # shellcheck disable=SC1090
  source <(helm completion bash)
  echo "source <(helm completion bash)" >>~/.bashrc
fi
