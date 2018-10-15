package br.com.cast.weatherAPI.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherDescriptionDTO {
	private String main;

	
public WeatherDescriptionDTO(@JsonProperty("main") String main) {
	this.main = main;
}
	public String getMain() {
		return main;
	}

}
