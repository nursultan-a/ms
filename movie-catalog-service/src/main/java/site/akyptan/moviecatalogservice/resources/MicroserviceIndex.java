package site.akyptan.moviecatalogservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
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
@RequestMapping("/")
public class MicroserviceIndex {


    public class MovieCatalogResource {
        @Autowired
        private RestTemplate restTemplate;

        @Autowired
        private DiscoveryClient discoveryClient;


        @RequestMapping("/{appName}")
        public List<ServiceInstance> getCatalog(@PathVariable("appName") String appName){
            return this.discoveryClient.getInstances(appName);
        }
        @RequestMapping(method= RequestMethod.GET)
        public String index()
        {
            return "index";
        }
    }

}
