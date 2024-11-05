package com.hibernateannotdemo.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernateannotdemo.pojo.Product;

public class SQLMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Query q = s.createNativeQuery("SELECT * FROM product");
		
		List<Object[]> lst = q.list();
		
		System.out.println("All products are :- ");
		for(Object[] arr : lst) {
			for(Object obj : arr)
				System.out.print(obj + " ");
			
			System.out.println();
		}
		
		sf.close();
	}
}
