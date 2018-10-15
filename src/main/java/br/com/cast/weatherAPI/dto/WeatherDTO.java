package br.com.cast.weatherAPI.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherDTO {
	@JsonProperty("list")
	private List<WeatherDataDTO> list;

	public List<WeatherDataDTO> getList() {
		return list;
	}

	public void setList(List<WeatherDataDTO> list) {
		this.list = list;
	}

}
