package com.hibernate.learning.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.learning.model.Employees;

public class EmployeeDetailsUsingHQL {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(Employees.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		session.beginTransaction();
		
		List<Employees> emplist=session.createQuery("from Employees e where e.lastName='Prasad'").getResultList();
		//List<Employees> emplist=session.createQuery("from Employees e").getResultList();
		session.getTransaction().commit();
		
		
		
		for (Iterator iterator = emplist.iterator(); iterator.hasNext();) {
			Employees employees = (Employees) iterator.next();
			System.err.println(employees.toString());
		}
		
		
	}
	
}
