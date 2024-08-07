FROM openjdk:17-jdk-alpine
WORKDIR /app
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} eureka.jar
CMD ["java", "-jar", "eureka.jar"]
