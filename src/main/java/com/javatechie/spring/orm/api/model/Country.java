package com.javatechie.spring.orm.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {
	@Id
	private String countryCode;
	private String countryName;
	@OneToMany(targetEntity = State.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "CountryKey", referencedColumnName = "countryCode")
	private List<State> states;

}
