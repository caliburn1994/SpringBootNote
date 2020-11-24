SHELL := /bin/bash
PATH := $(HOME)/.sdkman/candidates/java/current/bin:$(PATH)


MYSQL_PORT := 3306
MYSQL_USER := user
MYSQL_PASSWORD := userpass
MYSQL_DB := mydb
CONTAINER_NAME := mysqld
INIT_DIR := $(CURDIR)
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



installJava:
	curl -s "https://get.sdkman.io" | bash
	source "$(HOME)/.sdkman/bin/sdkman-init.sh"
	sdk version
	sdk install java 11.0.3.hs-adpt
	sdk home java 11.0.3.hs-adpt

groupId := icu.kyakya
module_name := $(notdir $(ROOT_DIR))
gradle_prefix := cd $(ROOT_DIR) ; $(ROOT_DIR)/gradlew
generate_path := $(groupId).orm

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
	sleep 3
	sed -i "/dependencies/ a \\\tcompile 'org.mybatis.generator:mybatis-generator-core:1.4.0'" $(ROOT_DIR)/build.gradle
	mkdir -p $(ROOT_DIR)/src/test/resources/mybatis/
	generate_path=$(generate_path) envsubst < $(INIT_DIR)/mybatis/generatorConfig_dynamicSql_Template.xml > $(ROOT_DIR)/src/test/resources/mybatis/generatorConfig_dynamicSql.xml
	generate_path=$(generate_path) envsubst < $(INIT_DIR)/mybatis/generatorConfig_simple_Template.xml > $(ROOT_DIR)/src/test/resources/mybatis/generatorConfig_simple.xml

	cp $(INIT_DIR)/app/GenerateJavaCode.java $(ROOT_DIR)/src/test/java
	$(gradle_prefix) build
	#$(gradle_prefix) cleanTest test --tests "GenerateJavaCode.run_dynamicSQL"
	#$(gradle_prefix) cleanTest test --tests "GenerateJavaCode.run_simple"




deleteAllFile:
	cd .. ; rm -rf `ls -aI "init"`

