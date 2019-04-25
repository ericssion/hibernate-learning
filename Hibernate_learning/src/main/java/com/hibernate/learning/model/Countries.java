package com.hibernate.learning.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="COUNTRIES")
public class Countries {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE ,generator="")
	@SequenceGenerator(name="",sequenceName="",allocationSize=1)
	@Column(name="COUNTRY_ID")
	private String countryId       ;
	@Column(name="COUNTRY_NAME")
	private String countryName     ;
	@Column(name="REGION_ID")
	private String regionId        ;
	
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	
	
}
