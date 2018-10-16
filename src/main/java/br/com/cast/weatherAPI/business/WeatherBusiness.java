package br.com.cast.weatherAPI.business;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.weatherAPI.dao.WeatherRepository;
import br.com.cast.weatherAPI.dto.ResultWeatherDTO;
import br.com.cast.weatherAPI.entidades.Weather;

@Service
public class WeatherBusiness {
	@Autowired
	private WeatherRepository wp;
	
	public List<ResultWeatherDTO> convertWeatherToResultWeatherDTO(List<Weather> dados) {
		List<ResultWeatherDTO> lista = new ArrayList<>();
		ResultWeatherDTO rwdto;
		for(Weather w : dados) {
			rwdto = new ResultWeatherDTO();
			rwdto.setCidade(w.getCidade());
			rwdto.setData(w.getData());
			rwdto.setDescricao(w.getDescricao());
			rwdto.setHumidade(w.getHumidade());
			rwdto.setPressao(w.getPressao());
			rwdto.setTemperatura_max(w.getTemperatura_max());
			rwdto.setTemperatura_min(w.getTemperatura_min());
			rwdto.setVelocidadevento(w.getVelocidadevento());
			lista.add(rwdto);
		}
		return lista;
	}

	public List<ResultWeatherDTO> buscarCidade(String cidade) {
		return convertWeatherToResultWeatherDTO(wp.buscarCidade(cidade));
	}
	@Transactional
	public void inserirDados(List<ResultWeatherDTO> lista) {
		List<Weather> wlist = convertRwdtoToWeather(lista);
		for(Weather w : wlist) {
			wp.insert(w);
		}
		
	}

	private List<Weather> convertRwdtoToWeather(List<ResultWeatherDTO> lista) {
		List<Weather> weathers = new ArrayList<>();
		Weather w;
		for(ResultWeatherDTO wdto : lista) {
			w = new Weather();
			w.setCidade(wdto.getCidade());
			w.setData(wdto.getData());
			w.setDescricao(wdto.getDescricao());
			w.setHumidade(wdto.getHumidade());
			w.setPressao(wdto.getPressao());
			w.setTemperatura_max(wdto.getTemperatura_max());
			w.setTemperatura_min(wdto.getTemperatura_min());
			w.setVelocidadevento(wdto.getVelocidadevento());
			weathers.add(w);
		}
		return weathers;
	}
	@Transactional
	public void deletarDados(String cidade) {
		wp.delete(cidade);
		
	}
	
	

}
