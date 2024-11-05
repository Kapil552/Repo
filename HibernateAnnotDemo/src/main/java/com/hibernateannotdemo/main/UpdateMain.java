package com.hibernateannotdemo.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernateannotdemo.pojo.Product;

public class UpdateMain {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		System.out.print("Enter id of the product to be"
				+ " updated : ");
		int prd_id = scanner.nextInt();
		
		Product product = s.get(Product.class, prd_id);
		
		if(product != null) {
			System.out.print("Enter new price of the "
					+ "product : ");
			int prc = scanner.nextInt();
			System.out.print("Enter new name of the "
					+ "product : ");
			String nm = scanner.next();
			
			product.setPname(nm);
			product.setPrice(prc);
			//s.update(product);	deprecated
			s.merge(product);
			tr.commit();
			
			System.out.println("product updated");
		} else {
			System.out.println("no such product found or"
					+ " product not updated");
		}
				
		sf.close();
	}
}
