## Description

This project integrates MyBatis with Spring and Spring Boot. The database is PostgreSQL, and the the data is from Gitlab, so we needn't consider anything about database design and data generation, and concentrate on application side.

## IDEA plug-in

[mybatis-log](https://plugins.jetbrains.com/plugin/14530-mybatis-log)

We use it to check what SQL application actually execute. It will help us to avoid duplicate query or improve query performance.

[MyBatis Lite](https://plugins.jetbrains.com/plugin/10921-mybatis-lite/versions)

If you use XML files in the project, you can use this plug-in to navigate between XML files and Java files.


## Q&A

### what is the service layer?

- [why-do-we-need-service-layer](https://stackoverflow.com/questions/46442790/why-do-we-need-service-layer)

Service Layer get data from  Controller Layer, and transform data or do something others, and then use Mapper to operate Database.