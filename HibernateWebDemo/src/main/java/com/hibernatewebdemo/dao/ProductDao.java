package com.hibernatewebdemo.dao;

import java.util.List;

import com.hibernatewebdemo.pojo.Product;

public interface ProductDao {

	List<Product> getAllProducts();
}
