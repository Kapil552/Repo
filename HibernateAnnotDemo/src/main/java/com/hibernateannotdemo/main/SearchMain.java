package com.hibernateannotdemo.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernateannotdemo.pojo.Product;

public class SearchMain {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		System.out.print("Enter id of the product to be"
				+ " searched : ");
		int prd_id = scanner.nextInt();
		
		Product product = s.get(Product.class, prd_id);
		
		//deprecated method in hibernate 6
		//Product product = s.load(Product.class, prd_id);
		
		if(product != null)
			System.out.println(product);
		else
			System.out.println("no such product found");
		
		sf.close();
	}
}
