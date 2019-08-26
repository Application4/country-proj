package com.javatechie.spring.orm.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.orm.api.dao.CountryRegionDAO;
import com.javatechie.spring.orm.api.model.Country;
import com.javatechie.spring.orm.api.model.State;

@RestController
public class CountryRegionController {
	@Autowired
	private CountryRegionDAO dao;
	
	@PostMapping("/save")
	public Country saveCountry(@RequestBody Country country) {
		return dao.save(country);
		
	}
	@GetMapping("/getState/{countryCode}")
	private List<State> findStates(@PathVariable String countryCode){
		return dao.findStatesByCountryCode(countryCode);
	}
	@GetMapping("/getRegionId/{stateName}")
	public String getRegionIdByStateName(@PathVariable String stateName) {
		return dao.findRegionIdByState(stateName);
	}
}
