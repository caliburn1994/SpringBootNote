

wrapper:
	gradle wrapper

gradle_build:
	echo "skip test"
	./gradlew build --exclude-task test


gradle_help:
	#echo "skip test"
	#./gradlew build --exclude-task test


sub_task:
	./gradlew :other