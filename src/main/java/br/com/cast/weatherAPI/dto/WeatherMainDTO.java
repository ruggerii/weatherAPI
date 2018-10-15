package br.com.cast.weatherAPI.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherMainDTO {
	private String temp_min;
	private String temp_max;
	private String pressure;
	private String humidity;
	
	public WeatherMainDTO(@JsonProperty("temp_min") String temp_min,
			@JsonProperty("temp_max") String temp_max,
			@JsonProperty("pressure") String pressure,
			@JsonProperty("humidity") String humidity) {
		this.temp_min = temp_max;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.humidity = humidity;
	}

	public String getTemp_min() {
		return temp_min;
	}

	public String getTemp_max() {
		return temp_max;
	}

	public String getPressure() {
		return pressure;
	}

	public String getHumidity() {
		return humidity;
	}
	
}
