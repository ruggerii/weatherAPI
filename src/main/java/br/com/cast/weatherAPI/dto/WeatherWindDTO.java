package br.com.cast.weatherAPI.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherWindDTO {
	private String speed;
	
	public WeatherWindDTO(@JsonProperty("speed") String speed) {
		this.speed = speed;
	}

	public String getSpeed() {
		return speed;
	}


	

}
