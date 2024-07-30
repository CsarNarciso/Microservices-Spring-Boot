Application features.
-
- Two main REST APIs (Books, Genres), wich communicated to each other by FeignClient technology.
- 
- You can use the Books or Genres APIS through postman. 

How it was built?
-

- The APIs were made using Spring Boot and JPA Repositories.
- MySQL database connection for persistence was made on two APIs.
- I implement Netflix Eureka Server microservices to set up service discovery.
- Uses Spring Cloud Gateway to handle HTTP requests/responses, this by service discovery via microservice id, not hostname and port (for best practices and security).
- Implementation of Config Server to handle microservices configuration globally.
- Use of FeignClient technology to connect Genres API request with Books API.
- CircuitBreaker set up in OpenFeign for Books API requests failures. 
- Tracing and monitoring system by Micrometer, Actuator and project Zipkin.

Complete technology stack.
-
- Spring Boot.
- Java 1.7.
- REST, microservices architecture.
- JPA.
- MySQL database.
- Spring Cloud Netflix Eureka server.
- API Gateway server.
- Config server.
- FeignClient.
- CircuitBreaker.
- Micrometer by Actuator project.
- Zipkin.
- Git.
