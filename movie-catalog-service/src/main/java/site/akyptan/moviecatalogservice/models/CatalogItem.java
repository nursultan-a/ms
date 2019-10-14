package site.akyptan.moviecatalogservice.models;

/**
 * @author Nursultan Abdrakypov
 * @email nuronjava@gmail.com
 */
public class CatalogItem {
    private String id;
    private String name;
    private String description;
    private int rating;

    public CatalogItem(String movieId, String name, String description, int rating) {
        this.id = movieId;
        this.name = name;
        this.description = description;
        this.rating = rating;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
