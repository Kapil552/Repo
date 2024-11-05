package com.singletabledemo1.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.singletabledemo1.pojo.ContractEmployee;
import com.singletabledemo1.pojo.NativeEmployee;

public class InsertMain {

	public static void main(String[] args) {
	
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf=config.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Transaction tr=s.beginTransaction();
		
		NativeEmployee ne1=new NativeEmployee();
		ne1.setEmpId(1233);
		ne1.setEmpName("Amit");
		ne1.setOffice("Bhopal");
		
		ContractEmployee ce1=new ContractEmployee();
		ce1.setEmpId(1234);
		ce1.setEmpName("Sumit");
		ce1.setSite("Indore");
		
		NativeEmployee ne2=new NativeEmployee();
		ne2.setEmpId(1235);
		ne2.setEmpName("Nimit");
		
		s.persist(ne1);
		s.persist(ne2);
		s.persist(ce1);
		
		tr.commit();
		
		System.out.println("Objects saved");
		
		sf.close();

	}

}
