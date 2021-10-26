# javaCodeSample_Group3
Lazos Familiares

## General Info
- Maven version 3.6.3
- Java Version 1.8
- Docker Version 20.10.8

## SPRING BOOT - WEB API
1.  Clone the repository
2.  Check the dependencies
3.  Verify the controller file
4.  Verify templates folder
5.  Run project
   
    -- To execute in Command line --
6.  mvn clean
7.  mvn install
8.  mvn spring-boot:run #run application
    
    -- To build and run docker --
9.  docker build -t lazos-spring-docker .
   #docker images #To list images builded
10. docker run --name lazos-spring-docker -p 8080:8080 lazos-spring-docker:latest

