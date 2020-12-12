SHELL := /bin/bash
PATH := $(shell dirname $(shell which java)):$(PATH)

INIT_DIR := $(CURDIR)
ROOT_DIR := $(shell dirname $(INIT_DIR))


groupId := icu.kyakya
module_name := $(notdir $(ROOT_DIR))
gradle_prefix := cd $(ROOT_DIR) ; $(ROOT_DIR)/gradlew
initJavaProject:
	curl -s https://start.spring.io/starter.tgz\
		   -d type=gradle-project \
		   -d language=java \
		   -d jvmVersion=15 \
		   -d platformVersion=2.4.1.RELEASE \
		   -d name=$(module_name) \
		   -d artifactId=$(module_name) \
		   -d groupId=$(groupId) \
		   -d dependencies=lombok,devtools,configuration-processor,testcontainers,web \
		   -d baseDir=$(module_name) \
		   | tar -xzvf - -C $(shell dirname $(ROOT_DIR))
	sleep 2
	$(gradle_prefix) build




