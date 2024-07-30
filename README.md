How it was built?
-

- The project uses two main REST APIs (Books, Genres), made with Spring Boot and JPA.
- MySQL database connection for persistence was made on two APIs.
- I implement Netflix Eureka Server microservices to set up service discovery.
- Uses Spring Cloud Gateway to handle HTTP requests/responses, this by service discovery via microservice id, not hostname and port (for best practices and security).
- Implementation of Config Server to handle microservices configuration globally.
- Use of FeignClient technology to connect Genres API request with Books API.
- CircuitBreaker set up in OpenFeign for Books API requests failures. 
- Tracing and monitoring system by Micrometer, Actuator and project Zipkin. 
