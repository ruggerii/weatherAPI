package br.com.cast.weatherAPI.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultWeatherDTO {
	private String temperatura_min;
	private String temperatura_max;
	private String pressao;
	private String humidade;
	private String descricao;
	private String velocidadevento;
	private String data;

	public static List<ResultWeatherDTO> fromResultWeatherDTO(WeatherDTO dto, String cidade) {
		ResultWeatherDTO rwdto;
		List<ResultWeatherDTO> lista = new ArrayList<>();
		Map<String, String> mapaDias = new HashMap<String, String>();
		for (WeatherDataDTO w : dto.getList()) {
			String day = String.valueOf(w.getDt_txt().charAt(8) + w.getDt_txt().charAt(9));
			
			if (!mapaDias.containsKey(day)) {
				mapaDias.put(day, cidade);
				rwdto = new ResultWeatherDTO();
				rwdto.setData(w.getDt_txt());
				rwdto.setDescricao(w.getWeather().get(0).getMain());
				rwdto.setHumidade(w.getMain().getHumidity());
				rwdto.setPressao(w.getMain().getPressure());
				rwdto.setTemperatura_max(w.getMain().getTemp_max());
				rwdto.setTemperatura_min(w.getMain().getTemp_min());
				rwdto.setVelocidadevento(w.getWind().getSpeed());
				lista.add(rwdto);
			}
		}
		return lista;
	}


	public String getTemperatura_min() {
		return temperatura_min;
	}


	public void setTemperatura_min(String temperatura_min) {
		this.temperatura_min = temperatura_min;
	}


	public String getTemperatura_max() {
		return temperatura_max;
	}


	public void setTemperatura_max(String temperatura_max) {
		this.temperatura_max = temperatura_max;
	}


	public String getPressao() {
		return pressao;
	}

	public void setPressao(String pressao) {
		this.pressao = pressao;
	}

	public String getHumidade() {
		return humidade;
	}

	public void setHumidade(String humidade) {
		this.humidade = humidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getVelocidadevento() {
		return velocidadevento;
	}

	public void setVelocidadevento(String velocidadevento) {
		this.velocidadevento = velocidadevento;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
