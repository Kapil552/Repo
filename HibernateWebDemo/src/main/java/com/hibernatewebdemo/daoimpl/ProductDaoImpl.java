package com.hibernatewebdemo.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hibernatewebdemo.dao.ProductDao;
import com.hibernatewebdemo.pojo.Product;
import com.hibernatewebdemo.sessionfactory.MySessionFactory;

public class ProductDaoImpl implements ProductDao {

	private SessionFactory sf = 
					MySessionFactory.getSessionFactory();
	
	@Override
	public List<Product> getAllProducts() {
		List<Product> lst = new ArrayList<>();
		try(Session s = sf.openSession()){
			Query<Product> q = s.createQuery("FROM Product",
			Product.class);
			lst = q.list();
			return lst;
		} catch (Exception exc) {
			exc.printStackTrace();
			lst.clear();
			return lst;
		}
	}
}





