FROM maven:latest	
WORKDIR /app
COPY . .
RUN mvn clean package
COPY ./target/BookApi-0.0.1.jar books.jar
CMD ["java", "-jar", "books.jar"]
