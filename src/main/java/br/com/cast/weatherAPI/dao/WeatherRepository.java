package br.com.cast.weatherAPI.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.cast.weatherAPI.entidades.Weather;

@Repository
public class WeatherRepository {
	@PersistenceContext
	EntityManager em;
	
	 public void insert(Weather w) {
		 em.persist(w);
	 }

	public List<Weather> buscarCidade(String cidade) {
		StringBuilder hql = new StringBuilder();
		hql.append(" SELECT w ")
		   .append(" FROM ").append(Weather.class.getName()).append(" w ")
		   .append(" WHERE w.cidade = :cidade ")
		   .append(" AND w.data >= :data ");
		
		Query query = em.createQuery(hql.toString());
		query.setParameter("cidade", cidade);
		query.setParameter("data", new Date());
		
		return query.getResultList();
	}

	public void delete(String cidade) {
		StringBuilder hql = new StringBuilder();
		hql.append("DELETE FROM ")
			.append(Weather.class.getName())
			.append(" w WHERE w.cidade = :cidade");
		
		Query query = em.createQuery(hql.toString());
		query.setParameter("cidade", cidade);
		query.executeUpdate();
		
	}

}
