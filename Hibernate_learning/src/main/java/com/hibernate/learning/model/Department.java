package com.hibernate.learning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENTS")
public class Department {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="")
	@SequenceGenerator(name="",sequenceName="",allocationSize=1)
	@Column(name="DEPARTMENT_ID")
	private String departmentId    ;
	@Column(name="DEPARTMENT_NAME")
	private String departmentName  ;
	@Column(name="MANAGER_ID")
	private String managerId       ;
	@Column(name="LOCATION_ID")
	private String locationId      ;
	
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getLocationId() {
		return locationId;
	}
	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}
}
