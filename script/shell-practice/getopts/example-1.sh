#!/usr/bin/env bash

Usage() {
  echo "Usage:
    test.sh [-j S_DIR] [-m D_DIR]
Description:
    S_DIR,the path of source.
    D_DIR,the path of destination.
" >&2
  exit 1
}

upload="false"

# 选项
is_correct_usage=true
while getopts 'h:j:m:u' OPT; do
  case $OPT in
  j) S_DIR="$OPTARG" ;;
  m) D_DIR="$OPTARG" ;;
  u) upload="true" ;;
  h | ?)
    echo "unknown usage"
    Usage ;;
  esac
done

# 没有选项
if [ $OPTIND -eq 1 ] || [ $is_correct_usage = false ]; then
  echo "non-option"
  Usage
fi


# 主函数
echo $S_DIR
echo $D_DIR
echo $upload
