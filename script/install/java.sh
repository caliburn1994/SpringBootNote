#!/usr/bin/env bash

# constant
PROJECT_ROOT_PATH="$(cd "$(dirname "${BASH_SOURCE[0]}")"/../.. >/dev/null 2>&1 && pwd)"
CURRENT_DIR=$(dirname "$0")

# dependencies
. "${PROJECT_ROOT_PATH}/script/common.sh"

echo_info "Running ${CURRENT_DIR}"
source "$HOME/.sdkman/bin/sdkman-init.sh" # as login shell, because sdkman is just valid in login shell mode
if ! type -p sdk &>/dev/null; then
  echo_debug "Installing sdk..."
  # https://sdkman.io/install
  curl -s "https://get.sdkman.io" | bash
  source "$HOME/.sdkman/bin/sdkman-init.sh"
  sdk version
fi

if ! type -p java &>/dev/null; then
  echo_debug "Installing java..."
  java_version=${1-"15.0.1-amzn"}
  echo "java version: ${java_version}"
  sdk install java "${java_version}"
fi

if ! type -p gradle &>/dev/null; then
  echo_debug "Installing latest gradle..."
  sdk install gradle
fi

if ! type -p mvn &>/dev/null; then
  echo_debug "Installing latest gradle..."
  sdk install maven
fi
