Project description.
-
I developed a RESTful application that handles books and literary genres data. The whole project uses a microservices architecture that ensures resilience and scalability.

Application features.
-
- Two main REST APIs (Books, Genres). Both handle GET and POST HTTP methods.
- APIs communicate to each other via HTTP client.
- Data persistence by SQL database connection.
- Everything under microservice architecture.
- APIs calls/request handle via service name, not hostname:port, this by GateWay feature.
- Configuration of each service handled by one unique microservice.
- APIs handle failures without get down when one of them try to call another one that is down or doesn't answer.
- Each one of the microservices is being monitoring for service life and HTTP metrics.  

How it was built?
-

- The APIs were made using Spring Boot and JPA Repositories.
- DTO implementation to entities for secure data transfer.
- Use of modelMapper dependency for dto to entity easier mapping.
- MySQL database connection for persistence was made on two APIs.
- I implement Netflix Eureka Server microservices to set up service discovery.
- Uses Spring Cloud Gateway to handle HTTP requests/responses, this by service discovery via microservice id, not hostname and port (for best practices and security).
- Implementation of Config Server to handle microservices configuration globally.
- Use of FeignClient technology to connect Genres API request with Books API.
- CircuitBreaker set up in OpenFeign for Books API requests failures. 
- Tracing and monitoring system by Micrometer, Actuator and project Zipkin.
- Testing with Postman Client.
- Version control by Git.

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
- ModelMapper.
- Maven.
- Git.
- Postman client.
