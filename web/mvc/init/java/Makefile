SHELL := /bin/bash
PATH := $(shell dirname $(shell which java)):$(PATH)

INIT_DIR := $(CURDIR)
ROOT_DIR := $(shell dirname $(INIT_DIR))


groupId := icu.kyakya
module_name := $(notdir $(ROOT_DIR))
gradle_prefix := cd $(ROOT_DIR) ; $(ROOT_DIR)/gradlew


	$(gradle_prefix) build

hello:
	echo hello