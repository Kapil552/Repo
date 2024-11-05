package com.mavenproject.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.mavenproject.pojo.Product;

public class ShowAllMain {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Query<Product> q=s.createQuery("from Product", Product.class);
		
		List<Product> lst=q.list();
		
		System.out.println("All products from list:");
		lst.forEach(System.out::println);
		
		sf.close();
	}

}
