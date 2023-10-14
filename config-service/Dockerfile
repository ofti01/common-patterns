FROM maven:3-openjdk-17 as build
WORKDIR /home/app/
COPY . /home/app/
RUN mvn clean package -DskipTests=true


#use an official java image
FROM openjdk:17-alpine
COPY --from=build /home/app/target/*.jar /usr/local/lib/app.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","/app.jar"]
