# Managing Multiple Services Using Spring Cloud Microservices Architecture and Docker compose 

Developing a RESTful application that handles books and literary genres data. The whole project uses a microservices architecture that ensures resilience and scalability.

## Table of contents


## Technologies
1. Java 17
2. Maven 3.0
3. Docker Compose
5. Spring Boot:
   + JPA
   + Hibernate
   + Actuator Project
6. Spring Cloud:
     + Netflix Eureka Server
     + Config Server
     + API Gateway Server
7. PostgreSQL
   
## Getting started

### Prerequisites
To use this project you must have the following
1. Git
3. Maven 3.0+
2. Docker Compose 

### Running the application
Follow the steps bellow to have this project up and running in your local environment

1. **Clone the repository**
    ```bash 
    git clone https://github.com/CsarNarciso/Microservices-Spring-Boot 
    ```
2. **Go to project root directory**
   ```bash
   cd Microservices-Spring-Boot/
   ```
3. **Build up the microservices**
   ```bash
   docker-compose up --build -d
   ```
   With this command Docker Compose will create and run each one of the Microservices Containers using their Images stored in DockerHub.

   Take in mind that the **-d** flag allows you to run the Containers on the background, if you want to see Microservices logs use
   ```docker logs microservice-container-name```

### Using the application

Now that all the Microservices are up and running, you can make use of Postman (or another REST Client) to access the following Endpoints

#### Endpoints
For Editorials API
For Books API

## How to bild this project

## Tests

