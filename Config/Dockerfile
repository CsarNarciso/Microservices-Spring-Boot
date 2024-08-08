FROM openjdk:17-jdk-alpine
WORKDIR /app
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} config.jar
CMD ["java", "-jar", "config.jar"]
