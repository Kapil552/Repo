package com.springmvcjsondemo.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvcjsondemo.dao.ProductDao;
import com.springmvcjsondemo.pojo.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	private SessionFactory factory;

	@Autowired
	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> lst = new ArrayList<>();
		try(Session s = factory.openSession()){
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
		try(Session s = factory.openSession()){
			Product product = s.get(Product.class, pid);
			return product;
		} catch (Exception exc) {
			exc.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addNewProduct(Product product) {
		try(Session s = factory.openSession()){
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
		try(Session s = factory.openSession()){
			Transaction tr = s.beginTransaction();
			Product prd = s.get(Product.class, 
					product.getId());
			if(prd != null) {
				prd.setName(product.getName());
				prd.setPrice(product.getPrice());
				tr.commit();
				return true;
			} else {
				return false;
			}
		} catch (Exception exc) {
			exc.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteProduct(int pid) {
		try(Session s = factory.openSession()){
			Transaction tr = s.beginTransaction();
			Product prd = s.get(Product.class,pid);
			if(prd != null) {
				s.remove(prd);
				tr.commit();
				return true;
			} else {
				return false;
			}
		} catch (Exception exc) {
			exc.printStackTrace();
			return false;
		}
	}
}
