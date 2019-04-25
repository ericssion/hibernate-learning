package com.hibernate.learning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="JOBS")
public class Jobs {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="")
	@SequenceGenerator(name="",sequenceName="",allocationSize=1)
	@Column(name="JOB_ID")
	private String jobId           ;
	
	@Column(name="JOB_TITLE")
	private String jobTitle        ;
	
	@Column(name="MIN_SALARY")
	private String minSalary       ;
	
	@Column(name="MAX_SALARY")
	private String maxSalary       ;
	
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(String minSalary) {
		this.minSalary = minSalary;
	}
	public String getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(String maxSalary) {
		this.maxSalary = maxSalary;
	}
	
}
