FROM maven:3.5-jdk-8 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/src/app/target/bank-api-1.0.0.jar"]
