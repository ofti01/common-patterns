FROM amazoncorretto:17-alpine
RUN mkdir /app
COPY config-service-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
