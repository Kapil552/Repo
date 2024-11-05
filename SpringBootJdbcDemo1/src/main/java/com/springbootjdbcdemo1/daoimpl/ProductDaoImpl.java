package com.springbootjdbcdemo1.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springbootjdbcdemo1.dao.ProductDao;
import com.springbootjdbcdemo1.pojo.Product;

public class ProductDaoImpl implements ProductDao{

	private JdbcTemplate jTemplate;
	
	@Autowired
	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplate = jTemplate;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> lst=new ArrayList<>();
		try {
			lst=jTemplate.query("select * from product",
					new BeanPropertyRowMapper<Product>(Product.class));
					return lst;
		}catch(EmptyResultDataAccessException exc) {
			exc.printStackTrace();
			return lst;
		}catch(Exception exc) {
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
			exc.printStackTrace();
			return null;
		}catch(Exception exc){
			exc.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean addNewProduct(Product product) {
		try {
			int count=jTemplate.update("insert into product (name,price),values(?,?)"
					,new Object[] {product.getName(),product.getPrice()});
			if(count>0)
				return true;
			else
				return false;
		}catch(Exception exc) {
			exc.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateProduct(Product product) {
		try {
			int count=jTemplate.update("update product set name=?, price=? where id=?",
					new Object[] {product.getName(),product.getPrice(),product.getId()});
			if(count>0)
				return true;
			else
				return false;
		}catch(Exception exc) {
			exc.printStackTrace();
			return false;
	}
}

	@Override
	public boolean deleteProduct(int pid) {
		try {
			int count=jTemplate.update("delete from product where id=?",pid);
			if(count>0)
				return true;
			else
				return false;
		}catch(Exception exc) {
			exc.printStackTrace();
			return false;
		}
	}
}
	

