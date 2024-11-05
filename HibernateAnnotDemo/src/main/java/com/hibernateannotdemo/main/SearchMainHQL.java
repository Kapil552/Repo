package com.hibernateannotdemo.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernateannotdemo.pojo.Product;

public class SearchMainHQL {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		System.out.print("Enter id of the product to be"
				+ " searched : ");
		int prd_id = scanner.nextInt();
		
		Query<Product> q = s.createQuery("FROM Product p"
				+ " WHERE p.pid = :id", Product.class);
		q.setParameter("id", prd_id);
		
		List<Product> lst = q.list();
		
		if(lst.size() > 0)
			System.out.println(lst.get(0));
		else
			System.out.println("no such product found");
		
		sf.close();
	}
}
