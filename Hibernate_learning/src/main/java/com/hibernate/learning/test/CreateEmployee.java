package com.hibernate.learning.test;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.learning.model.Employees;

public class CreateEmployee {
	
	public static void main(String[] args) {
		
	SessionFactory factory=new Configuration().configure().addAnnotatedClass(Employees.class).buildSessionFactory();
		
	Session session=factory.getCurrentSession();
	
	try {
		
		Employees e=new Employees();
		e.setLastName("Prasad");
		e.setLastName("Gudavalli");
		e.setJobId("FI_MGR");
		e.setEmail("pras@gmail.com");
		e.setSalary("17000");
		e.setHireDate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		session.beginTransaction();
		
	 	session.save(e);
		session.getTransaction().commit();
		System.err.println(e.getEmployeeId());
		
	}finally {
		session.close();
	}
		
	}
	
}
