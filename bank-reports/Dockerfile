FROM maven:3.5-jdk-8 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/src/app/target/bank-reports-1.0.0.jar"]

# git clone https://github.com/glarimy/spring-cloud-microservice
# docker build -t yodlee/bank-reports .
# docker images
# docker run yodlee/bank-reports