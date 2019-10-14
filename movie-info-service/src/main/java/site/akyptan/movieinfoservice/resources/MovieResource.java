package site.akyptan.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.akyptan.movieinfoservice.models.Movie;

/**
 * @author Nursultan Abdrakypov
 * @email nuronjava@gmail.com
 */

@RestController
@RequestMapping("/movies")
public class MovieResource {
    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
        return new Movie(movieId, "The movie: "+movieId, "description of the movie, with id "+movieId);

    }
}
