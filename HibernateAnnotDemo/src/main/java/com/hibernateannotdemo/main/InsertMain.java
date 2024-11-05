package com.hibernateannotdemo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateannotdemo.pojo.Product;

public class InsertMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		Product p1 = new Product();
		p1.setPname("pen");
		p1.setPrice(34);
		
		s.persist(p1);
		
		tr.commit();
		
		System.out.println("product saved");
		
		sf.close();
	}
}
