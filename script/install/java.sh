#!/usr/bin/env bash

source "$HOME/.sdkman/bin/sdkman-init.sh"  # as login shell, because sdkman is just valid in login shell mode

install() {
  if ! type -p sdk &>/dev/null; then
    echo "Installing sdk..."
    # https://sdkman.io/install
    curl -s "https://get.sdkman.io" | bash
    source "$HOME/.sdkman/bin/sdkman-init.sh"
    sdk version
  fi

  if ! type -p java &>/dev/null; then
    java_version=${1-"15.0.1-amzn"}
    echo "Installing java..."
    echo "java version: ${java_version}"
    sdk install java "${java_version}"
  fi

  if ! type -p gradle &>/dev/null; then
    echo "Installing latest gradle..."
    sdk install gradle
  fi

  if ! type -p mvn &>/dev/null; then
    echo "Installing latest gradle..."
    sdk install maven
  fi
}

echo "checking java..."

if [ ! -d ~/.sdkman ]; then
  install "$@"
fi
