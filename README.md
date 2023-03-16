# Inhabitants backend (Code in Master branch, but read these instructions first)

this project was made with [SpringBoot](https://spring.io/)

## Brief description

Inhabitants is a web application that is used for the management and control of the access of external people to a building, where we can register people to know in which part of the building they will circulate, in addition to later removing or editing their registration when leaving the building or when requesting a change.

use is made of Spring Boot + JPA + PostgresSQL + Rest + Angular

## Requirements

For building and running the application you need:

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Gradle 2.7](https://gradle.org/)
- [PostgreSQL](https://www.postgresql.org/)

You will need to setup your own database or create a database with the following configuration

```
spring.datasource.url=jdbc:postgresql://localhost:5432/inhabitans-db
spring.datasource.username=postgres
spring.datasource.password=admin
```

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.inhabitants.InHabitantsApplication` class from your IDE.

Alternatively you can use the [Spring Boot Gradle plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins.html#build-tool-plugins.gradle) like so:

```
gradle bootRun
```

## Running port

- default spring boot config http://localhost:8080/

## Swagger url

- default swagger url http://localhost:8080/swagger-ui/

## About this project

This project consists of two parts, the BackEnd and the [FrontEnd](https://github.com/CristCT/inhabitants_frontend) of the application called inhabitants, to obtain the correct operation of the application, obtain both.
