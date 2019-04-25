package com.hibernate.learning.test;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.learning.model.Employees;

public class RetriveEmployeeDetails {

	
	public static void main(String[] args) {
		
		//create sessionfactory object
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Employees.class).buildSessionFactory();
		
		//get session object
		
		Session session=factory.getCurrentSession();
		//begin the transaction
		session.beginTransaction();
		
		Employees e=new Employees();
		e.setLastName("Prasad");
		e.setJobId("FI_MGR");
		e.setEmail("prasadb@gmail.com");
		e.setSalary("17000");
		e.setHireDate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		
		//get the employee details
		
		session.save(e);
		
		//commit the transaction
		session.getTransaction().commit();
		
		session=factory.getCurrentSession();
		session.beginTransaction();
		
		Employees emp= session.get(Employees.class, e.getEmployeeId());
		session.getTransaction().commit();
		
		System.err.println(emp.toString());
	}
	
	
}
