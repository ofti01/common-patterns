
FROM openjdk:17-jdk-slim

WORKDIR /app

ADD target/*.jar /app/app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
