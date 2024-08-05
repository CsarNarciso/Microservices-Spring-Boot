FROM openjdk:7	
RUN ["mvn", "clean package"]
COPY ./target/*.jar books.jar
CMD ["java", "-jar", "*.jar"]
