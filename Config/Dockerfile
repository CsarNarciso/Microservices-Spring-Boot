FROM maven:latest
WORKDIR /app
COPY . .
RUN mvn clean package
COPY ./target/Config-0.0.1-SNAPSHOT.jar config.jar
CMD ["java", "-jar", "config.jar"]
