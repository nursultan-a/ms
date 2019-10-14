package site.akyptan.moviecatalogservice.models;

import java.util.List;

/**
 * @author Nursultan Abdrakypov
 * @email nuronjava@gmail.com
 */
public class UserRating {
    private List<Rating> userRating;

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }
}
