# https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start

curl -s https://start.spring.io/starter.tgz\
       -d name=orm\
       -d artifactId=orm\
       -d groupId=icu.kyakya\
       -d type=gradle-project\
       -d dependencies=lombok,devtools,configuration-processor,h2,mybatis\
       -d baseDir=orm\
       | tar -xzvf -