package site.akyptan.moviecatalogservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import site.akyptan.moviecatalogservice.models.Catalog;
import site.akyptan.moviecatalogservice.models.CatalogItem;
import site.akyptan.moviecatalogservice.models.Movie;
import site.akyptan.moviecatalogservice.models.UserRating;


import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Nursultan Abdrakypov
 * @email nuronjava@gmail.com
 */

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;


    @RequestMapping("/{userId}")
    public Catalog getCatalog(@PathVariable("userId") String userId) {
        // Get all rated movieIds
        UserRating ratings = restTemplate.getForObject("http://rating-data-service/ratingsdata/users/" + userId, UserRating.class);

        List<CatalogItem> catalogList = ratings.getUserRating().stream().map(rating -> {
            // For each movie ID, call movie info service and get details
            Movie movie = restTemplate.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);

            //Put all of them together: 2 REST API calls
            return new CatalogItem(movie.getMovieId(), movie.getName(), movie.getDesc(), rating.getRating());
        }).collect(Collectors.toList());

        Catalog catalog = new Catalog(catalogList);
        return catalog;
    }
//    @RequestMapping("/{userId}")
//    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
//        // Get all rated movieIds
//        UserRating ratings = restTemplate.getForObject("http://rating-data-service/ratingsdata/users/"+userId, UserRating.class);
//
//        return ratings.getUserRating().stream().map(rating ->{
//            // For each movie ID, call movie info service and get details
//            Movie movie = restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), Movie.class);
//
//            //Put all of them together: 2 REST API calls
//            return new CatalogItem(movie.getMovieId(), movie.getName(), "test", rating.getRating());
//        }).collect(Collectors.toList());
//    }
}
