#!/usr/bin/env bash
set -e

root_dir="$(cd ../../; pwd)"

. "${root_dir}/script/color.sh"
green=green
reset=reset

usage() {
  echo -e "
  ${1}Usage:
      $0 [-d dependencies] [-l location] [-m module_name] [-g group_id] [-h]
  Description:
      dependencies: what dependencies the new spring project use.
      location: location of project.
      module_name: the name of module and directory.
      group_id: group id, the default value is ${green}${group_id}${reset} .
" >&2
  exit 1
}

group_id="icu.kyakya"

dependencies="lombok,devtools,configuration-processor"
while getopts 'd:g:l:m:h' OPT; do
  case $OPT in
  d) dependencies="$OPTARG";;
  g) group_id="$OPTARG" ;;
  l) location="$OPTARG" ;;
  m) module_name="$OPTARG" ;;
  h) usage;;
  ?) usage "unknown usage.\n  ";
  esac
done

if [ -z "${location}" ]; then
    echo "-l must be included " >&2
    exit 1
else
    project_dir="${root_dir}/${location}"
    mkdir -p "${project_dir}"
fi

echo "
artifactId=${module_name}
name=${module_name}
group_id=${group_id}
dependencies=${dependencies}
project dir=${project_dir}
"


# download
# todo jvm version not right
curl -s https://start.spring.io/starter.tgz \
  -d type=gradle-project \
  -d language=java \
  -d jvmVersion=15 \
  -d platformVersion=2.4.1.RELEASE \
  -d name="${module_name}" \
  -d artifactId="${module_name}" \
  -d group_id="${group_id}" \
  -d dependencies="${dependencies}" \
  -d baseDir="${module_name}" |
  tar -xzvf - -C "${project_dir}"
sleep 2
