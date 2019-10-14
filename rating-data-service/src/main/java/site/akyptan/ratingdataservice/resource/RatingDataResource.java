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
                new Rating("1", 4),
                new Rating("2", 0),
                new Rating("3", 9),
                new Rating("4", 7),
                new Rating("5", 5),
                new Rating("6", 10),
                new Rating("7", 1),
                new Rating("8", 2),
                new Rating("9", 6),
                new Rating("10", 8)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }

}
