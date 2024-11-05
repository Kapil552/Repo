package com.onetomanybidemo.main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.onetomanybidemo.pojo.Customer;
import com.onetomanybidemo.pojo.Order;

public class RightOuterMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Query<Object[]> q = s.createQuery("FROM Customer c"
				+ " RIGHT OUTER JOIN c.orders", 
		Object[].class);
		
		List<Object[]> lst = q.list();
		
		for(Object[] arr : lst) {
			for(Object obj : arr) {
				if(obj instanceof Customer) {
					Customer cust = (Customer) obj;
					System.out.println(cust.getCustomerId()
					+ " : " + cust.getCustomerName());
				}
				if(obj instanceof Order) {
					Order ord = (Order) obj;
					System.out.println(ord.getOrderId()
					+ " : " + ord.getProduct());
				}
			}
		}
		
		sf.close();
	}
}
