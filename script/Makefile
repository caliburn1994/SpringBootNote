ifneq ($(MAKECMDGOALS),)
FIRST_GOAL := $(word 1, $(MAKECMDGOALS))
LAST_GOAL := $(word $(words $(MAKECMDGOALS)), $(MAKECMDGOALS))
else
FIRST_GOAL := all
LAST_GOAL := all
endif

#Dummy rule to set the default
.PHONY: all
all ::

$(FIRST_GOAL) ::
	@echo "Starting Root Makefile..."
	chmod -R 777 ./

all :: gradle docker

.PHONY: gradle
gradle::
	./install/java.sh

.PHONY: docker
docker::
	./deploy/docker.sh

.PHONY: ubuntu
ubuntu::
	./ubuntu.sh

$(LAST_GOAL) ::
	@echo "Root Makefile..."


