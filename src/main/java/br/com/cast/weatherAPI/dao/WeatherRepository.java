package br.com.cast.weatherAPI.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class WeatherRepository {
	@PersistenceContext
	EntityManager em;
	
	 

}
