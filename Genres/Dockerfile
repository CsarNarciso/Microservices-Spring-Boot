FROM maven:latest
WORKDIR /app
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} genres.jar
CMD ["java", "-jar", "genres.jar"]
