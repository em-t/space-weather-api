package fi.academy.nasarest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class NasaController {

    @RequestMapping(value = "/dailyimage", method = RequestMethod.GET, produces = "application/json")
    //@GetMapping("/randomimage")
    public String getImage() {
        final String uri = "https://api.nasa.gov/planetary/apod?api_key=F25jyFa6o7VNblHsOGmIGiBB0ARC1uL4xo0qKp6l";

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }

    @RequestMapping(value = "DONKI/CME", method = RequestMethod.GET, produces = "application/json")
    public String getCME() {
        final String uri = "https://api.nasa.gov/DONKI/CME?startDate=2018-01-01&endDate=2018-11-12&api_key=F25jyFa6o7VNblHsOGmIGiBB0ARC1uL4xo0qKp6l";

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, String.class);
    }

}
