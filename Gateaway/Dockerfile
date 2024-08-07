FROM maven:latest
WORKDIR /app
COPY . .	
RUN mvn clean package
COPY ./target/Gateaway-0.0.1.jar gateaway.jar
CMD ["java", "-jar", "gateaway.jar"]
