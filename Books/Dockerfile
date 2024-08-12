FROM openjdk:17-jdk-alpine	
WORKDIR /app
RUN apk add --no-cache curl
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} books.jar
CMD ["java", "-jar", "books.jar"]
