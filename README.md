# ms

There is 
  * 3 Spring boot applications(each of them are stanalone and Eureka Client/Microservice):
      1. Movie Catalog Service(movie-catalog-service)
      2. Movie Info Service(movie-info-service)
      3. Movie Rating(ratings-data-service)
  * 1 Discovery Server(Name Server: Eureka Server)


Definition

Lists Users watched momvies with its own rating,

Basically;
First I created discovery server and I published 2 Spring Boot Application as microservice to DISCOVERY SERVER using Eureka Client.
 then I have microservices located in another microservice using Eureka Client.
  
  
  
