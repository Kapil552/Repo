package com.springjdbcdemo1.dao;

import java.util.List;

import com.springjdbcdemo1.pojo.Product;

public interface ProductDao {

	List<Product> getAllProducts();
	Product searchProduct(int pid);
	boolean addNewProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(int pid);
	
}
