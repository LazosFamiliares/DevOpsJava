# syntax=docker/dockerfile:1
FROM adoptopenjdk/maven-openjdk8
WORKDIR /samplejava
COPY pom.xml /samplejava/pom.xml
COPY src /samplejava/src
RUN mvn clean install