package com.mavenproject.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mavenproject.pojo.Product;

public class InsertMain {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction ts=s.beginTransaction();
		
		Product p1=new Product();
		p1.setPname("Guitar");
		p1.setPrice(1500);

		s.persist(p1);
		
		ts.commit();
		
		System.out.println("product saved");
		
		sf.close();
	}

}
