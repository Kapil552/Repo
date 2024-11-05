package com.onetomanybidemo.main;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.onetomanybidemo.pojo.Customer;
import com.onetomanybidemo.pojo.Order;

public class AppMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		Customer c1 = new Customer();
		c1.setCustomerId(1233);
		c1.setCustomerName("Amit");
		
		Order o1 = new Order();
		o1.setOrderId(4566);
		o1.setProduct("printer");
		o1.setCustomer(c1);
		
		Order o2 = new Order();
		o2.setOrderId(4567);
		o2.setProduct("scanner");
		o2.setCustomer(c1);
		
		Set<Order> oset = new HashSet<>();
		oset.add(o1);
		oset.add(o2);
		
		c1.setOrders(oset);
		
		s.persist(c1);
		s.persist(o1);
		s.persist(o2);
		
		tr.commit();
		System.out.println("objects saved");
		
		sf.close();
	}
}
