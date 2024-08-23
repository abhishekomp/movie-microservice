
# Run your Microservices in Docker containers and connect to Postgres in Docker.
## Usage of Eureka Server, API Gateway, Zipkin all running in Docker containers

- This project demonstrates starting an entire Microservice setup using Docker compose.  
- It uses Docker compose to run the Spring Boot app connected to Postgres DB with all of these running in their own separate containers.
- Eureka Discovery for the business microservices (movie-catalog and movie-info)

# Steps to run the project
Step 0: Make sure docker is installed and running.  
Step 1: Build the projects (4 projects in total) to create the .jar file (`./mvnw clean package -DskipTests`) (If needed, `chmod +x mvnw`)   
Step 3: Run docker compose up:  
`docker compose -f ./docker-compose.yaml up`  
Step 4: Import the provided Postman collection to test the api end points:  
- Add movie: `http://localhost:8080/movie-catalog-service/addMovie`
- Add movie info: `http://localhost:8080/movie-info-service/addMovieInfo`
- Fetch movie: `http://localhost:8080/movie-info-service/getMovieInfo/1`
- Fetch movie genre: `http://localhost:8080/movie-catalog-service/getGenre/1`
