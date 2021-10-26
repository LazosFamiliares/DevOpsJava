package udem.SampleJava.servingwebcontent.ws.service;

import udem.SampleJava.servingwebcontent.pojo.Weather;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private static final Logger log = LoggerFactory.getLogger(WeatherService.class);
    private final static String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather";
    private final static String API_KEY = "5731f65b7e659ad920e10df3675fddd2";

    public Weather getWeatherBy(String zip, String country) {
        RestTemplate restTemplate = new RestTemplate();
        String urlRestWS = String.format("%s?zip=%s,%s&APPID=%s",
                WEATHER_URL,
                zip,
                country,
                API_KEY);
        Weather weather = restTemplate.getForObject(urlRestWS, Weather.class);
        log.info(weather.toString());

        return weather;
    }
}
