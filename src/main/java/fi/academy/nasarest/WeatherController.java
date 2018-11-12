package fi.academy.nasarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;

@RestController
public class WeatherController {
    private WeatherRepository repo;

    @Autowired
    public WeatherController(WeatherRepository repo) {
        this.repo = repo;
    }
    
    @RequestMapping(value = "/spaceweather", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Weather> getAllWeatherTypes() {
        return repo.findAll();
    }

    @RequestMapping(value = "/spaceweather/{type}", method = RequestMethod.GET, produces = "application/json")
    public Weather getWeatherType(@PathVariable(name = "type") String type) {
        return repo.findByType(type);
    }
}
