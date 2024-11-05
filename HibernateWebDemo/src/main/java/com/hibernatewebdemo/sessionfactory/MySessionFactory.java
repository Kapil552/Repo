package com.hibernatewebdemo.sessionfactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactory {

	public static SessionFactory getSessionFactory() {
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			SessionFactory sf = config.buildSessionFactory();
			return sf;
		} catch (Exception exc) {
			exc.printStackTrace();
			return null;
		}
	}
}
