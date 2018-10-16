package br.com.cast.weatherAPI.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="weather", schema="weather")
public class Weather {
	@Id
	@SequenceGenerator(name="weatherSeq", allocationSize=1,initialValue=1,sequenceName="weather.weather_id_seq")
	@GeneratedValue(generator="weatherSeq", strategy=GenerationType.SEQUENCE)
	private Integer id;
	private Date data;
	private String temperatura_min;
	private String temperatura_max;
	private String pressao;
	private String humidade;
	private String descricao;
	private String icon;
	private String velocidadevento;
	private String cidade;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	
	

}
