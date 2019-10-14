# ms

There is 
  * 3 Spring boot applications(each of them are stanalone and Eureka Client/Microservice):
      1. Movie Catalog Service(movie-catalog-service)
      2. Movie Info Service(movie-info-service)
      3. Movie Rating(ratings-data-service)
  * 1 Discovery Server(Name Server: Eureka Server)


Definition

* Lists Users watched momvies with its own rating,

* Didn't configured config server: Configuration is hard coded

* Movie IDs and Ratings also hard coded

Basically;

First I created discovery server and I published 

2 Spring Boot Application(

     1.ratings-data-service: http://localhost:8083/ratingsdata/users/{userId} returns list of ratings
     
     2.movie-info-service: http://localhost:8082/movies/{movieId} returns movies details
)

as microservice to DISCOVERY SERVER using Eureka Client.

 Then I have microservices located 
 in another microservice 'movie-catalog-service'(http://localhost:8081/catalog/{userId}) using Eureka Client.
 
 Lists each move that user watched with details(from movie-info-service) and reitings(from ratings-data-service).
 
  
 

  
  
  
