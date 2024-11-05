package com.onetoonebidemo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetoonebidemo.pojo.Account;
import com.onetoonebidemo.pojo.Employee;

public class AppMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		Account acct = new Account();
		acct.setAccountId(1233);
		acct.setAccountNumber("ACCT012245");
		
		Employee emp = new Employee();
		emp.setEmpId(4566);
		emp.setEmpName("Amit");
		
		acct.setEmployee(emp);
		emp.setAccount(acct);
		
		s.persist(acct);
		s.persist(emp);
		
		tr.commit();
		
		System.out.println("objects saved");
		
		sf.close();
	}
}
