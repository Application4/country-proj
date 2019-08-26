package com.javatechie.spring.orm.api.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javatechie.spring.orm.api.model.Country;
import com.javatechie.spring.orm.api.model.State;

@Repository
@Transactional
public class CountryRegionDAO {
	@Autowired
	private SessionFactory factory;

	public Country save(Country country) {
		getSession().save(country);
		return country;
	}
	
	public List<State> findStatesByCountryCode(String countryCode){
		Country country=getSession().get(Country.class, countryCode);
		List<State> states=country.getStates();
		return states;
	}

	private Session getSession() {
		Session session = factory.getCurrentSession();
		if (session == null) {
			session = factory.openSession();
		}
		return session;
	}

	public String findRegionIdByState(String stateName) {
		State state=(State) getSession().createCriteria(State.class).add(Restrictions.eq("stateName", stateName)).uniqueResult();
		return state.getRegionId();
	}
}
