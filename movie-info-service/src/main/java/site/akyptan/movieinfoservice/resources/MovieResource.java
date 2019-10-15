package site.akyptan.movieinfoservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import site.akyptan.movieinfoservice.models.Movie;
import site.akyptan.movieinfoservice.models.MovieSummary;

/**
 * @author Nursultan Abdrakypov
 * @email nuronjava@gmail.com
 */

@RestController
@RequestMapping("/movies")
public class MovieResource {
    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){

        MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+ apiKey, MovieSummary.class);


        return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());

    }
}
