package com.onetomanybidemo.main;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.onetomanybidemo.pojo.Customer;
import com.onetomanybidemo.pojo.Order;

public class SelectMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Customer c = (Customer) s.get(Customer.class, 1233);
		
		System.out.println(c.getCustomerId() + " : "
				+ c.getCustomerName());
		
		for(Order o : c.getOrders())
			System.out.println(o.getOrderId() + " : "
					+ o.getProduct());
		
		sf.close();
	}
}
