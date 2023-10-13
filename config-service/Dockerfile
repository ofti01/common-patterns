
#use an official java image
FROM openjdk:17-alpine

LABEL maintainer="salitha ekanayaka"
ADD target/*.jar springboot-docker-demo.jar
ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]
