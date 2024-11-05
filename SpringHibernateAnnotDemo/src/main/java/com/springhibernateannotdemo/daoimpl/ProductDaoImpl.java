package com.springhibernateannotdemo.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springhibernateannotdemo.dao.ProductDao;
import com.springhibernateannotdemo.pojo.Product;

@Component
public class ProductDaoImpl implements ProductDao {

	private SessionFactory sf;

	@Autowired
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

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

	@Override
	public Product searchProduct(int pid) {
		try(Session s = sf.openSession()){
			Query<Product> q = s.createQuery("FROM Product p"
					+ " WHERE p.id = :pid",Product.class);
			q.setParameter("pid", pid);
			List<Product> lst = q.list();
			if(lst.size() > 0)
				return lst.get(0);
			else
				return null;
		} catch (Exception exc) {
			exc.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addNewProduct(Product product) {
		try(Session s = sf.openSession()){
			Transaction tr = s.beginTransaction();
			s.persist(product);
			tr.commit();
			return true;
		} catch (Exception exc) {
			exc.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product product) {
		try(Session s = sf.openSession()){
			Transaction tr = s.beginTransaction();
			Query q = s.createQuery("UPDATE Product p SET"
			+ " p.name = :nm , p.price = :prc "
			+ "WHERE p.id = :pid");
			q.setParameter("nm", product.getName());
			q.setParameter("prc", product.getPrice());
			q.setParameter("pid", product.getId());
			int count = q.executeUpdate();
			tr.commit();
			if(count > 0)
				return true;
			else
				return false;
		} catch (Exception exc) {
			exc.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProduct(int pid) {
		try(Session s = sf.openSession()){
			Transaction tr = s.beginTransaction();
			Query q = s.createQuery("DELETE FROM Product p "
					+ "WHERE p.id = :pid");
			q.setParameter("pid", pid);
			int count = q.executeUpdate();
			tr.commit();
			if(count > 0)
				return true;
			else
				return false;
		} catch (Exception exc) {
			exc.printStackTrace();
			return false;
		}
	}
}
