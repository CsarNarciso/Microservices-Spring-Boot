FROM maven:latest
WORKDIR /app
COPY . .	
RUN mvn clean package
COPY ./target/Editorials-0.0.1.jar genres.jar
CMD ["java", "-jar", "genres.jar"]
