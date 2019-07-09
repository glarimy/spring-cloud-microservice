FROM openjdk:8-jdk-alpine
MAINTAINER Krishna Mohan Koyya <krishna@glarimy.com>
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/bank-api-1.0.0.jar
ADD ${JAR_FILE} bank-api-1.0.0.jar
ENTRYPOINT ["java","-jar","/bank-api-1.0.0.jar"]
