#use an official java image
FROM openjdk:17-alpine

#Set working directory in the container
WORKDIR /app

#copy the jar file to the container
COPY *.jar app.jar

#expose port for the application
EXPOSE 8080

#Set the command to run the JAR file

CMD ["java", "-jar", "app.jar"]
