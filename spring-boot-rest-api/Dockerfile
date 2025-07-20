FROM openjdk:21
WORKDIR /app
COPY ./target/spring-boot-rest-api.jar rest-api.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "rest-api.jar"]