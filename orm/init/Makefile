MYSQL_PORT := 3306
MYSQL_USER := user
MYSQL_PASSWORD := userpass
MYSQL_DB := mydb
CONTAINER_NAME := mysqld
INIT_DIR := $(shell dirname $(realpath $(firstword $(MAKEFILE_LIST))))
ROOT_DIR := $(shell dirname $(INIT_DIR))

# run background
#DAEMON_MODE := -d


# 5.7
# 8.0.22
MYSQL_VERSION := 8.0.22

include test.mk


init:
	mkdir -p "$(INIT_DIR)/MySQL/config"
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



groupId := icu.kyakya
module_name := mybatis

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


GRADLEW_PREFIX := cd $(ROOT_DIR) && $(ROOT_DIR)/gradlew
generate_path := $(groupId).orm
installJava:
	curl -s "https://get.sdkman.io" | bash
	source "$HOME/.sdkman/bin/sdkman-init.sh"
	sdk version
	sdk install java

test2222:
	cp -r $(INIT_DIR)/mybatis $(ROOT_DIR)/src/test/resources
	$(GRADLEW_PREFIX) cleanTest test --tests "icu.kyakya.orm.generate.run_dynamicSQL"


test3333:
	generate_path=$(generate_path) envsubst < $(INIT_DIR)/mybatis/generatorConfig_dynamicSql_Template.xml > $(INIT_DIR)/mybatis/generatorConfig_dynamicSql.xml
	generate_path=$(generate_path) envsubst < $(INIT_DIR)/mybatis/generatorConfig_simple_Template.xml > $(INIT_DIR)/mybatis/generatorConfig_simple.xml
