# Microservices


* Movie Info Service: 
   Input: Movie ID
   Output: Movie Details
   (Movie Details comes from themoviedb.og site by external call in this microservice)
   
 
* Rating Data Service: 
   Input: User ID
   Output: Movie IDs and Movie raitings
   
   (user id does not matter, there is only 2 hard coded rated movie)
   
   
* Movie Catalog Service: 
   Input: User ID
   Output: Movie list with details
   
   (user id does not matter)  



# Config Server

* Config servers github url: https://github.com/nursultan-a/config.git



* I made external rest request to get Movie Details from the https://www.themoviedb.org on movie-info-service microservice
   example: curl http://localhost:8082/movies/{movieId}
   more about the api: https://www.themoviedb.org/settings/api
   
   
* Config server's github url: https://github.com/nursultan-a/config.git
  it has 3 .properties file for 3 microservice, all 3 microservice gets its port number from here, basically it shows that config server is working
  
  
  
# Examples

* http://localhost:8082/movies/{movieId} : it will give movieID, name and description if the given {movieId} have in themoviedb.org
* http://localhost:8761/ : Eureka
* http://localhost:8081/catalog/{userId}: list 2 film from themomviedb.org according to given movieid from ratings-data-microservice
* http://localhost:8083/ratingsdata/users/{userId}: list 2 hardcoded film id and ratings, user id does not matter
* http://localhost:8888/{microservice}/default: gives {microservice}'s configuration 




 
  
 

  
  
  
