#!/usr/bin/env bash

# https://sdkman.io/install
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk version

sdk install java 15.0.1-amzn
sdk install gradle