package com.springbootjdbcdemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.springbootjdbcdemo1.dao.ProductDao;
import com.springbootjdbcdemo1.pojo.Product;

public class JsonController {

	private ProductDao daoimpl;

	@Autowired
	public void setDaoimpl(ProductDao daoimpl) {
		this.daoimpl = daoimpl;
	}
	
	/*
	 	request method  :  Get
	 	request URl : http://localhost:9005/getall
	 */
	@GetMapping(value="/getall")
	public List<Product> getAll(){
		List<Product> lst=daoimpl.getAllProducts();
		return lst;
	}
	
	/*
	 request method : Get
	 request URL : http://localhost:9005/search?id=7
	 
	 */
}
