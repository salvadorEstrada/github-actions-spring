From  eclipse-temurin:25-jdk-alpine
EXPOSE: 8080
ADD target/api-gitactions.jar api-gitactions-new.jar
ENTRYPOINT ["java", "-jar", "/api-gitactions-new.jar"]