FROM openjdk:17-jdk-alpine
WORKDIR /app
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} gateaway.jar
CMD ["java", "-jar", "gateaway.jar"]
