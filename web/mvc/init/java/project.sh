#!/usr/bin/env bash
#set -e

#groupId=${1-groupId}

groupId="icu.kyakya"

while getopts ":a:g:h:" opt; do
  case $opt in
  g)
    groupId="${OPTARG}"
    echo "-a was triggered!" >&2
    ;;
  h | *)
    echo "help"
    echo "${OPTARG}"
    echo "Invalid option: -$OPTARG" >&2
    ;;
  esac
done


echo "${groupId}"

#curl -s https://start.spring.io/starter.tgz \
#  -d type=gradle-project \
#  -d language=java \
#  -d jvmVersion=15 \
#  -d platformVersion=2.4.1.RELEASE \
#  -d name=$(module_name) \
#  -d artifactId=$(module_name) \
#  -d groupId=${groupId} \
#  -d dependencies=lombok,devtools,configuration-processor,testcontainers,web,thymeleaf \
#  -d baseDir=$(module_name) |
#  tar -xzvf - -C $(shell dirname $(ROOT_DIR))
#sleep 2