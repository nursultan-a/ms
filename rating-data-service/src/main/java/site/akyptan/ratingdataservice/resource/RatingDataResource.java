package site.akyptan.ratingdataservice.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.akyptan.ratingdataservice.models.Rating;
import site.akyptan.ratingdataservice.models.UserRating;

import java.util.Arrays;
import java.util.List;

/**
 * @author Nursultan Abdrakypov
 * @email nuronjava@gmail.com
 */
@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String movieId){
        List<Rating> ratings = Arrays.asList(
                new Rating("101", 4),
                new Rating("201", 0)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }

}
