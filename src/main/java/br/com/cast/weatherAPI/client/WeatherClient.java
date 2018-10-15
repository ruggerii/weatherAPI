package br.com.cast.weatherAPI.client;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.cast.weatherAPI.dto.ResultWeatherDTO;
import br.com.cast.weatherAPI.dto.WeatherDTO;

@Component
public class WeatherClient {
	private static final String EVENT_GET = "http://api.openweathermap.org/data/2.5/forecast?q={cidade},br&units=metric&mode=json&appid={appid}&lang=pt";
	private static final String APP_ID = "f9fcd81e56aa6e628c0f2e8c22eea100";
	private final RestTemplate restTemplate;

	public WeatherClient(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}

	public List<ResultWeatherDTO> fetchEvents(String cidade){
		WeatherDTO wdto = this.restTemplate.getForObject(EVENT_GET, WeatherDTO.class,cidade, APP_ID);
		return ResultWeatherDTO.fromResultWeatherDTO(wdto, cidade);
	}

}
