FROM openjdk:17-jdk-alpine
WORKDIR /app
RUN apk add --no-cache curl
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} gateaway.jar
CMD ["java", "-jar", "gateaway.jar"]
