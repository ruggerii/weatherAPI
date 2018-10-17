package br.com.cast.weatherAPI.dto;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.cast.weatherAPI.client.WeatherClient;

public class ResultWeatherDTO {
	private String temperatura_min;
	private String temperatura_max;
	private String pressao;
	private String humidade;
	private String descricao;
	private String velocidadevento;
	private Date data;
	private String icon;
	public String getIcon() {
		return icon;
	}


	public void setIcon(String icon) {
		this.icon = icon;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}

	private String cidade;

	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public static List<ResultWeatherDTO> fromResultWeatherDTO(WeatherDTO dto, String cidade) {
		ResultWeatherDTO rwdto;
		List<ResultWeatherDTO> lista = new ArrayList<>();
		Map<Date, String> mapaDias = new HashMap<Date, String>();
		for (WeatherDataDTO w : dto.getList()) {
			Date day = WeatherClient.stringToDate(w.getDt_txt());
			if (!mapaDias.containsKey(day)) {
				mapaDias.put(day, cidade);
				rwdto = new ResultWeatherDTO();
				rwdto.setData(WeatherClient.stringToDate(w.getDt_txt()));
				rwdto.setDescricao(w.getWeather().get(0).getMain());
				rwdto.setIcon(w.getWeather().get(0).getIcon());
				rwdto.setHumidade(w.getMain().getHumidity());
				rwdto.setPressao(w.getMain().getPressure());
				rwdto.setTemperatura_max(w.getMain().getTemp_max());
				rwdto.setTemperatura_min(w.getMain().getTemp_min());
				rwdto.setVelocidadevento(w.getWind().getSpeed());
				rwdto.setCidade(cidade);
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


}
