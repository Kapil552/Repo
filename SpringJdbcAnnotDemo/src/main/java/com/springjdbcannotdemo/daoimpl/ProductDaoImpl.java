package com.springjdbcannotdemo.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbcannotdemo.dao.ProductDao;
import com.springjdbcannotdemo.pojo.Product;

public class ProductDaoImpl implements ProductDao {

	private JdbcTemplate jTemplate;
	
	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplate = jTemplate;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> lst = new ArrayList<>();
		try {
			lst = jTemplate.query("SELECT * FROM product",
			new BeanPropertyRowMapper<Product>(Product.class));
			return lst;
		} catch (EmptyResultDataAccessException exc) {
			return lst;
		} 
		catch (Exception exc) {
			exc.printStackTrace();
			lst.clear();
			return lst;
		}
	}

	@Override
	public Product searchProduct(int pid) {
		Product product = null;
		try {
			product = jTemplate.queryForObject("SELECT * FROM "
			+ "product WHERE id = ?",
			new BeanPropertyRowMapper<Product>(Product.class),
			pid);
			return product;
		} catch (EmptyResultDataAccessException exc) {
			return null;
		} 
		catch (Exception exc) {
			exc.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addNewProduct(Product product) {
		try {
			int count = jTemplate.update("INSERT INTO"
			+ " product(name,price) VALUES (?,?)" , 
			new Object[] {product.getName() , 
			product.getPrice()});
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
	public boolean updateProduct(Product product) {
		try {
			int count = jTemplate.update("UPDATE product"
			+ " SET name = ? , price = ? WHERE id = ?" , 
			new Object[] {product.getName(), 
			product.getPrice(), product.getId()});
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
		try {
			int count = jTemplate.update("DELETE FROM product"
			+ " WHERE id = ?", pid);
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
