package com.singletabledemo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.singletabledemo.pojo.ContractEmployee;
import com.singletabledemo.pojo.NativeEmployee;

public class InsertMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		NativeEmployee ne1 = new NativeEmployee();
		ne1.setEmpId(1233);
		ne1.setEmpName("Amit");
		ne1.setOffice("Indore");
		
		ContractEmployee ce1 = new ContractEmployee();
		ce1.setEmpId(1234);
		ce1.setEmpName("Sumit");
		ce1.setSite("Bhopal");
		
		NativeEmployee ne2 = new NativeEmployee();
		ne2.setEmpId(1235);
		ne2.setEmpName("Nimit");
		
		s.persist(ne1);
		s.persist(ce1);
		s.persist(ne2);
		
		tr.commit();
		
		System.out.println("objects saved");
		
		sf.close();
	}
}
