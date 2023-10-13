#use an official java image
FROM openjdk:17-alpine

RUN mkdir /app
COPY *.jar /app/app.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
