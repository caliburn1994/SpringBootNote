#!/usr/bin/env bash

# https://sdkman.io/install
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk version

sdk install java
sdk install gradle