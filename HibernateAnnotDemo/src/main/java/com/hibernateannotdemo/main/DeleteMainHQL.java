package com.hibernateannotdemo.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernateannotdemo.pojo.Product;

public class DeleteMainHQL {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		System.out.print("Enter id of the product to be"
				+ " deleted : ");
		int prd_id = scanner.nextInt();
		
		Query q = s.createQuery("DELETE FROM Product p "
				+ "WHERE p.pid = :id");
		q.setParameter("id", prd_id);
		
		int count = q.executeUpdate();
		tr.commit();
		
		if(count > 0)
			System.out.println("product deleted");
		else
			System.out.println("no such product found or"
					+ " product not deleted");
		
		sf.close();
	}
}
