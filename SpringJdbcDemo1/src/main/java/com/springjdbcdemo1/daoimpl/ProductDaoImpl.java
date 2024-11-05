package com.springjdbcdemo1.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbcdemo1.dao.ProductDao;
import com.springjdbcdemo1.pojo.Product;

public class ProductDaoImpl implements ProductDao{
	
	private JdbcTemplate jTemplate;

	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplate = jTemplate;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> lst=new ArrayList<>();
		try {
			lst=jTemplate.query("select * from product", 
					new BeanPropertyRowMapper<>(Product.class));
				return lst;
		}catch(EmptyResultDataAccessException exc){
			return lst;
		}
		catch(Exception exc) {
			exc.printStackTrace();
			lst.clear();
			return lst;
		}
	}

	@Override
	public Product searchProduct(int pid) {
		Product product=null;
		try {
			product=jTemplate.queryForObject("select * from product where id=?",
					new BeanPropertyRowMapper<Product>(Product.class),pid); 
			return product;
		}catch(EmptyResultDataAccessException exc) {
			return null;
		}catch(Exception exc) {
			exc.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addNewProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProduct(int pid) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
