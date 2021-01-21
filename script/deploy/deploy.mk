start:
	minikube start
	minikube dashboard

stop:
	minikube stop
	docker container ls

check1:
	docker container ls

check2:
	kubectl get po -A


dashboard:

bug:
	#重新开机