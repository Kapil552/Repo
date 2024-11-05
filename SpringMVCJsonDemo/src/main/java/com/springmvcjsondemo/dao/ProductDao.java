package com.springmvcjsondemo.dao;

import java.util.List;

import com.springmvcjsondemo.pojo.Product;

public interface ProductDao {

	//query operations
	List<Product> getAllProducts();
	Product searchProduct(int pid);
	
	//crud operations
	boolean addNewProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(int pid);
}





