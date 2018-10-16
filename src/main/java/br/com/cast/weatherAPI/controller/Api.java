package br.com.cast.weatherAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.weatherAPI.client.WeatherClient;
import br.com.cast.weatherAPI.dto.ResultWeatherDTO;

@RestController
@RequestMapping(path="/")
public class Api {
	@Autowired
	WeatherClient wc;
	@RequestMapping(method=RequestMethod.GET)
	public List<ResultWeatherDTO> buscarTempo(@RequestParam("q") String cidade) {
		return wc.fetchEvents(cidade);
	}

}
