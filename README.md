How it was built?
-

- The project uses two main REST APIs (Books, Genres), made with Spring Boot and JPA.
- MySQL database connection for persistence was made on two APIs.
- I implement Netflix Eureka Server mcsv to set up service discovery.
- It uses Spring Cloud Gateway for HTTP requests/responses handlement, this by service discovery via mcsv Id, not hostname and port (for best practices and security).
- Implementation of Config Server to handle mcsvs configuration in global way.
- Use of FeignClient technology to connect Genres API request to Books one.
- CircuitBreaker set up in OpenFeign for Books API requests failures. 
- Tracing and monitoring system by Micrometer, Actuator and project Zipkin. 
