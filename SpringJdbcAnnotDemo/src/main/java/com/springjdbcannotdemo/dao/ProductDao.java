package com.springjdbcannotdemo.dao;

import java.util.List;

import com.springjdbcannotdemo.pojo.Product;

public interface ProductDao {

	List<Product> getAllProducts();
	Product searchProduct(int pid);
	boolean addNewProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(int pid);
}
