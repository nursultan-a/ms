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

  
  
  
# Examples

* http://localhost:8082/movies/{movieId} : it will give movieID, name and description if the given {movieId} have in themoviedb.org

* http://localhost:8761/ : Eureka

* http://localhost:8081/catalog/{userId}: list 2 film from themomviedb.org according to given movieid from ratings-data-microservice

* http://localhost:8083/ratingsdata/users/{userId}: list 2 hardcoded film id and ratings, user id does not matter

* http://localhost:8888/{microservice}/default: This is a CONFIG SERVER and it gives {microservice}'s configuration 




 
  
 

  
  
  
