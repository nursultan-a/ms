package site.akyptan.moviecatalogservice.models;

import java.util.List;

/**
 * @author Nursultan Abdrakypov
 * @email nuronjava@gmail.com
 */
public class Catalog {
    private List<CatalogItem> catalog;

    public Catalog(List<CatalogItem> catalog) {
        this.catalog = catalog;
    }

    public List<CatalogItem> getCatalog() {
        return catalog;
    }

    public void setCatalog(List<CatalogItem> catalog) {
        this.catalog = catalog;
    }
}
