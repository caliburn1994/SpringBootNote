SHELL := /bin/bash
PATH := $(shell dirname $(shell which java)):/home/xiaojie/.sdkman/candidates/java/current/bin:$(PATH)
INIT_DIR := $(CURDIR)
ROOT_DIR := $(shell dirname $(INIT_DIR))


MYSQL_PORT := 3306
MYSQL_USER := user
MYSQL_PASSWORD := userpass
MYSQL_DB := mydb
CONTAINER_NAME := mysqld


# run background
#DAEMON_MODE := -d


# 5.7
# 8.0.22
MYSQL_VERSION := 8.0.22

include test.mk


initDocker:
	chmod 777 MySQL
	docker run $(DAEMON_MODE) \
    -p $(MYSQL_PORT):3306 \
    --name $(CONTAINER_NAME) \
    -e MYSQL_DATABASE=$(MYSQL_DB) \
    -e MYSQL_USER=$(MYSQL_USER) \
    -e MYSQL_PASSWORD=$(MYSQL_PASSWORD) \
    -e MYSQL_ROOT_PASSWORD=password \
    -v $(INIT_DIR)/MySQL/schema.sql:/docker-entrypoint-initdb.d/schema.sql \
    -v $(INIT_DIR)/MySQL/config/my.cnf:/etc/mysql/my.cnf \
    mysql/mysql-server:$(MYSQL_VERSION)


destroy:
	docker container stop $(CONTAINER_NAME)
	docker container rm $(CONTAINER_NAME)



groupId := icu.kyakya.orm
module_name := $(notdir $(ROOT_DIR))
gradle_prefix := cd $(ROOT_DIR) ; $(ROOT_DIR)/gradlew
generate_path := $(groupId).$(module_name)

xml_file_path := $(ROOT_DIR)/src/test/resources/mybatis

initJavaProject:
	# https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start
	curl -s https://start.spring.io/starter.tgz\
		   -d name=$(module_name) \
		   -d artifactId=$(module_name) \
		   -d groupId=$(groupId) \
		   -d type=gradle-project \
		   -d dependencies=lombok,devtools,configuration-processor,mysql,mybatis,testcontainers \
		   -d baseDir=$(module_name) \
		   | tar -xzvf - -C $(shell dirname $(ROOT_DIR))
	sleep 2
