test1:
	docker container exec  $(CONTAINER_NAME)  ls -tlr /etc/mysql/my.cnf
	docker container exec  $(CONTAINER_NAME)  cat /etc/mysql/my.cnf
	#mysql -u $(MYSQL_USER) -p -h 127.0.0.1

inspect:
	docker container ls
	docker container inspect $(CONTAINER_NAME)


runMySQLAsRoot:
	docker container exec -it $(CONTAINER_NAME)  mysql -u root -p

runMySQLAsUser:
	docker container exec -it $(CONTAINER_NAME)  mysql -u user -p

login:
	docker container exec -it $(CONTAINER_NAME) bash