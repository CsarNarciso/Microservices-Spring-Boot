# Managing Multiple Services Using Spring Cloud Microservices Architecture and Docker compose 

This project demonstrates a RESTful application for managing books and literary genres. It utilizes a microservices architecture to ensure resilience and scalability.

## Table of Contents
* [Technologies](#technologies)
* [Getting started](#getting-started)
  + [Prerequisites](#prerequisites)
  + [Running the application](#running-the-application)
  + [Using the application](#using-the-application)
* [How to build this project](#how-to-build-this-project)
* [Tests](#tests)
* [Contact me](#contact-me)


## Technologies
1. Java 17
2. Maven 3.0+
3. Docker Compose
5. Spring Boot:
   + JPA
   + Hibernate
   + Actuator
6. Spring Cloud:
   + Netflix Eureka Server
   + Config Server
   + API Gateway Server
7. PostgreSQL
   
## Getting Started

### Prerequisites
To use this project, you must have the following installed:
1. Git
3. Maven 3.0+
2. Docker Compose 

### Running the Application
Follow these steps to set up the project locally:

1. **Clone the repository**
    ```bash 
    git clone https://github.com/CsarNarciso/Microservices-Spring-Boot 
    ```
2. **Navigate to the project root directory**
   ```bash
   cd Microservices-Spring-Boot/
   ```
3. **Build and start the microservices**
   ```bash
   docker-compose up -d
   ```
   This command will create and run each microservice container using its image stored in Docker Hub. The **-d** flag runs the containers in the background, to view the logs use:
   ```bash
   docker logs microservice-container-name
   ```
4. Now, you should see the following output, wich indicates everything was built correct
   ![Project set up successfully](readme-images/project-set-up-successfully)

5. Also, you can check the created images with:
   ```bash
   docker images
   ```
6. To check the running containers:
   ```bash
   docker ps
   ```
7. For networks and volumes used by the project, use:
   ```bash
   docker network ls
   docker volume ls
   ``` 

### Using the Application

1. With all microservices running, you can use a REST client like Postman or cURL to access the following endpoints:

#### Editorials API

* Check Editorials service health
```bash
http://localhost:8001/actuator/health
```
* Get books and editorial info by editorial ID  
```bash
http://localhost:8001/editorials/1
```

#### Books API

* Check Books service health
```bash
http://localhost:8002/actuator/health
```
* Find books by editorial ID
```bash
http://localhost:8002/books/1
```

2. Finally, to stop and remove from your system all the docker components created by the project, use:
   ```bash
  docker-compose down
   ``` 

## How to Build this Project

## Tests

## Contact Me
* [LinkedIn](https://www.linkedin.com/in/cesar-pozol-narciso-b48727180/)
