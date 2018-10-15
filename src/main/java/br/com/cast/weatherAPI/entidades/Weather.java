package br.com.cast.weatherAPI.entidades;

public class Weather {
	
	private String temperatura_min;
	private String temperatura_max;
	private String pressao;
	private String humidade;
	private String descricao;
	private String velocidadevento;
	private String data;
	
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
