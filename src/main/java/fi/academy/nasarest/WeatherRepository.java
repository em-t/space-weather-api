package fi.academy.nasarest;

import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<Weather, String> {

    Weather findByType(String type);
}
