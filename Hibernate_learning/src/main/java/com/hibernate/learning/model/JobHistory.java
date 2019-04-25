package com.hibernate.learning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="JOB_HISTORY")
public class JobHistory {

	@Column(name="EMPLOYEE_ID")
	private String employeeId		;
	@Column(name="START_DATE")
	private String startDate       ;
	@Column(name="END_DATE")
	private String endDate         ;
	@Column(name="JOB_ID")
	private String jobId           ;
	@Column(name="DEPARTMENT_ID")
	private String departmentId    ;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	
}
