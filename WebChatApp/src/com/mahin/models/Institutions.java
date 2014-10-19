package com.mahin.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="institutions")

public class Institutions {

	@Id @GeneratedValue
	  private long institutionsid;
	  private String name;
	  private String city;
	  private String country;
	  
	public long getInstitutionsid() {
		return institutionsid;
	}
	public void setInstitutionsid(long institutionsid) {
		this.institutionsid = institutionsid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	  
}
