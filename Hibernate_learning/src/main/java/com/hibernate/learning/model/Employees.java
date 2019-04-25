package com.hibernate.learning.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEES")
public class Employees {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "EMP_SEQ")
	@SequenceGenerator(name="EMP_SEQ",sequenceName ="EMPLOYEES_ID",allocationSize = 1)
	@Column(name="EMPLOYEE_ID")
	int employeeId;
	
	@Column(name="FIRST_NAME")
	String firstName;
	
	@Column(name="LAST_NAME")
	String lastName;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="PHONE_NUMBER")
	String phoneNumber;
	
	@Column(name="HIRE_DATE")
	Date hireDate;
	
	@Column(name="JOB_ID")
	String jobId;
	
	@Column(name="SALARY")
	String salary;
	
	@Column(name="COMMISSION_PCT")
	String commissionpct;
	
	@Column(name="MANAGER_ID")
	String managerId;
	
	@Column(name="DEPARTMENT_ID")
	String departmentId;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getCommissionpct() {
		return commissionpct;
	}
	public void setCommissionpct(String commissionpct) {
		this.commissionpct = commissionpct;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId
				+ ", salary=" + salary + ", commissionpct=" + commissionpct + ", managerId=" + managerId
				+ ", departmentId=" + departmentId + "]";
	}
	
	
	
	
}
