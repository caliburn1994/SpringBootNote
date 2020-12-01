SHELL := /bin/bash
PATH := $(shell dirname $(shell which java)):$(PATH)

INIT_DIR := $(CURDIR)
ROOT_DIR := $(shell dirname $(INIT_DIR))


groupId := icu.kyakya
module_name := $(notdir $(ROOT_DIR))
gradle_prefix := cd $(ROOT_DIR) ; $(ROOT_DIR)/gradlew
initJavaProject:
	curl -s https://start.spring.io/starter.tgz\
		   -d name=$(module_name) \
		   -d artifactId=$(module_name) \
		   -d groupId=$(groupId) \
		   -d type=gradle-project \
		   -d dependencies=lombok,devtools,configuration-processor,testcontainers \
		   -d baseDir=$(module_name) \
		   | tar -xzvf - -C $(shell dirname $(ROOT_DIR))
	sleep 2
	$(gradle_prefix) build



download_Jar_generate_jks:
	wget https://repo1.maven.org/maven2/com/github/tomakehurst/wiremock-jre8-standalone/2.27.2/wiremock-jre8-standalone-2.27.2.jar
	keytool -genkey -alias wiremock -keyalg RSA -keysize 1024 \
        -validity 365 -keypass password -keystore identity.jks -storepass password



run_wireMock:
	# https://en.wikipedia.org/wiki/Xargs
	ls wiremock-jre8-standalone* | xargs  -I '{}' java -jar '{}' --https-port 8081 --https-keystore ./identity.jks

jks_to_pkcs12:
	keytool -importkeystore -srckeystore identity.jks -destkeystore truststore.p12 -srcstoretype JKS -deststoretype PKCS12

pkcs12_to_pem:
	openssl pkcs12 -in truststore.p12 -out truststore.pem

test:
	#curl --cert identity.pem --cacert truststore.pem https://localhost:8081

	curl  --cert truststore.pem:password https://localhost:8081