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



store_password := Mypasswor222
key_password := Mypasswor222
store_name := truststore

download_Jar:
	wget https://repo1.maven.org/maven2/com/github/tomakehurst/wiremock-jre8-standalone/2.27.2/wiremock-jre8-standalone-2.27.2.jar

generate_jks:
	keytool -genkey -alias wiremock -keyalg RSA -keysize 1024 \
	-dname "CN=kyakya.icu, OU=none, O=none, L=Tokyo, S=Tokyo, C=Japan" \
	-validity 365 -keypass password -keystore $(store_name).jks -storepass $(store_password) -keypass  $(key_password)

	keytool -srcstoretype JKS -deststoretype PKCS12 \
	-importkeystore -srckeystore $(store_name).jks -destkeystore $(store_name).p12  \
	-srcstorepass $(store_password) -srckeypass $(key_password)  -srcalias wiremock \
	-deststorepass $(store_password)

	openssl pkcs12 -in $(store_name).p12 -out $(store_name).pem -passin pass:$(store_password) -passout pass:$(store_password)


run_wireMock:
	# https://github.com/tomakehurst/wiremock/blob/2b5087207a8989f3fd989982573305d59f3c753d/src/main/java/com/github/tomakehurst/wiremock/standalone/CommandLineOptions.java
	# https://en.wikipedia.org/wiki/Xargs
	ls wiremock-jre8-standalone* | xargs  -I '{}' java -jar '{}' --https-port 8081 \
	--https-keystore ./$(store_name).jks --keystore-password $(store_password)  \



test:
	#curl --cert identity.pem --cacert truststore.pem https://localhost:8081

	curl  --cert truststore.pem:$(store_password) https://localhost:8081

# todo https://stackoverflow.com/questions/19014541/curl-to-pass-ssl-certifcate-and-password