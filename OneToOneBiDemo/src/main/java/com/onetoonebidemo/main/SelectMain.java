package com.onetoonebidemo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoonebidemo.pojo.Account;
import com.onetoonebidemo.pojo.Employee;

public class SelectMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Employee e = (Employee) s.get(Employee.class, 4566);
		
		System.out.println(e.getEmpId() + " : " + 
		e.getEmpName());
		
		System.out.println(e.getAccount().getAccountId()
				+ " : " + e.getAccount().getAccountNumber());
		
		sf.close();
	}
}
