#!/usr/bin/env bash
set -e

install() {
  java_version=${1-"15.0.1-amzn"}

  echo "Installing sdkman,JDK,Gradle"
  echo "java version: ${java_version}"

  # https://sdkman.io/install
  curl -s "https://get.sdkman.io" | bash
  source "$HOME/.sdkman/bin/sdkman-init.sh"
  sdk version

  sdk install java "${java_version}"
  sdk install gradle
  sdk install maven
}

if [ ! -d ~/.sdkman ]; then
  install "$@"
fi
