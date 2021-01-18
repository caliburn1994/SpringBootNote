

start:
	sudo minikube start

stop:
	minikube stop
	docker container ls

check:
	docker container ls

dashboard:
	minikube dashboard

bug:
	#重新开机