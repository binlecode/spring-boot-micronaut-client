package micronaut.example.clientbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class MusicController {

    @Autowired
    private ItunesClient itunesClient;

    @RequestMapping("/search/{searchTerm}")
    public List<Album> index(@PathVariable String searchTerm) {
        SearchResult searchResult = itunesClient.search(searchTerm);
        return searchResult.getResults();
    }
}