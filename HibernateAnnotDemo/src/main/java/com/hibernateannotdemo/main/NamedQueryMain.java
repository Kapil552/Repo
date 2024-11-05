package com.hibernateannotdemo.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernateannotdemo.pojo.Product;

public class NamedQueryMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		//deprecated
		//Query<Product> q = s.getNamedQuery("myquery");
		
		Query<Product> q = s.createNamedQuery("myquery",
				Product.class);
		
		List<Product> lst = q.list();
		
		System.out.println("All products are :- ");
		lst.forEach(System.out::println);
		
		sf.close();
	}
}
