package com.joineddemo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.joineddemo.pojo.FourWheeler;
import com.joineddemo.pojo.TwoWheeler;

public class AppMain {

	public static void main(String[] args) {
	
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tr = s.beginTransaction();
		
		TwoWheeler tw = new TwoWheeler();
		tw.setVehicleId(1233);
		tw.setHandle("straight");
		tw.setSeats(2);
		
		FourWheeler fw = new FourWheeler();
		fw.setVehicleId(1234);
		fw.setSeats(5);
		fw.setSteering("power");
		
		s.persist(fw);
		s.persist(tw);
		
		tr.commit();
		
		System.out.println("objects saved");
		
		sf.close();
	}
}
