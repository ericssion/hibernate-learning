package com.hibernate.learning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="REGIONS")
public class Regions {
	
	@Column(name="REGION_ID")
	private String regionId        ;
	@Column(name="REGION_NAME")
	private String regionName      ;
	public String getRegionId() {
		return regionId;
	}
	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
}
