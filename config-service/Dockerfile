FROM yannoff/maven:3.8.5-openjdk-17-alpine as build
WORKDIR /app
COPY . /app/
RUN mvn clean package -DskipTests=true -U


#use an official java image
FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]
