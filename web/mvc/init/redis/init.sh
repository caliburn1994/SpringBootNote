#!/usr/bin/env bash


# https://hub.docker.com/_/redis

run() {
  docker run --name single-redis -d redis
}

stop() {
  docker stop container single-redis
}


echo "Running $*"
"$@"
