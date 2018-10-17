package br.com.cast.weatherAPI.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.cast.weatherAPI.business.WeatherBusiness;
import br.com.cast.weatherAPI.dto.ResultWeatherDTO;
import br.com.cast.weatherAPI.dto.WeatherDTO;

@Component
public class WeatherClient {
	private static final String EVENT_GET = "http://api.openweathermap.org/data/2.5/forecast?q={cidade},br&units=metric&mode=json&appid={appid}&lang=pt";
	private static final String APP_ID = "f9fcd81e56aa6e628c0f2e8c22eea100";
	private final RestTemplate restTemplate;
	@Autowired
	WeatherBusiness wb;

	public WeatherClient(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}

	public List<ResultWeatherDTO> fetchEvents(String cidade) {
		List<ResultWeatherDTO> lista = wb.buscarCidade(cidade);
		if (lista.size() < 5) {
			WeatherDTO wdto = this.restTemplate.getForObject(EVENT_GET, WeatherDTO.class, cidade, APP_ID);
			
			if(!lista.isEmpty()) {
			wb.deletarDados(cidade);
			}
			
			lista = ResultWeatherDTO.fromResultWeatherDTO(wdto, cidade);
			wb.inserirDados(lista);
		}

		return lista;
	}

	public static Date stringToDate(String date) {
		Date data = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		try {
			data = format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;
	}

}
