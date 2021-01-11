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

#Preprocessing
$(FIRST_GOAL) ::
	@echo "Starting make..."
	chmod -R 777 ./

all :: gradle docker

.PHONY: gradle
gradle::
	./install_gradle.sh

.PHONY: docker
docker::
	./install_docker.sh

#Postprocessing
$(LAST_GOAL) ::
	@echo "All done..."