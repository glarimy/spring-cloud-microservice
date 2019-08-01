FROM maven:3.5-jdk-8 AS build
COPY src /usr/glarimy/src
COPY pom.xml /usr/glarimy
RUN mvn -f /usr/glarimy/pom.xml clean package
EXPOSE 8080
ENTRYPOINT ["java","-Dspring.datasource.url= jdbc:mysql://localhost:3306/glarimy?useSSL=false","-jar","/usr/glarimy/target/glrimy-service-1.0.0.jar"]