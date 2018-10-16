package br.com.cast.weatherAPI.dto;

import java.util.Date;
import java.util.List;

public class WeatherDataDTO {

	private WeatherMainDTO main;
	private List<WeatherDescriptionDTO> weather;
	private WeatherWindDTO wind;
	private String dt_txt;
	

	public String getDt_txt() {
		return dt_txt;
	}

	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}

	public WeatherMainDTO getMain() {
		return main;
	}

	public void setMain(WeatherMainDTO main) {
		this.main = main;
	}

	public List<WeatherDescriptionDTO> getWeather() {
		return weather;
	}

	public void setWeather(List<WeatherDescriptionDTO> weather) {
		this.weather = weather;
	}

	public WeatherWindDTO getWind() {
		return wind;
	}

	public void setWind(WeatherWindDTO wind) {
		this.wind = wind;
	}



}
