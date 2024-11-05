package com.springbootjdbcdemo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjdbcdemo.dao.ProductDao;
import com.springbootjdbcdemo.pojo.Product;

@RestController
public class JsonController {

	private ProductDao daoImpl;

	@Autowired
	public void setDaoImpl(ProductDao daoImpl) {
		this.daoImpl = daoImpl;
	}
	
	/*
		request method : GET
		request url : 
		http://localhost:9009/getall
	*/
	@GetMapping(value = "/getall")
	public List<Product> getAll() {
		List<Product> lst = daoImpl.getAllProducts();
		return lst;
	}
	
	/*
		request method : GET
		request url : 
		http://localhost:9009/search?pid=3
	*/
	@GetMapping(value = "/search")
	public Product getdata(@RequestParam("pid") int id) {
		Product product = daoImpl.searchProduct(id);
		return product;
	}
	
	/*
		request method : POST
		request url : 
		http://localhost:9009/add
		request header : Content-Type : application/json
		json to be sent in request body :-
				{
					"name" : "shoes",
					"price" : 80000
				}
	*/
	@PostMapping(value = "/add")
	public HashMap<String, String> add(
	@RequestBody Product product) {
		HashMap<String, String> hmap = new HashMap<>();
		if(daoImpl.addNewProduct(product)) {
			hmap.put("message", "success");
		} else {
			hmap.put("message", "error");
		}
		return hmap;
	}
	
	/*
		request method : PUT
		request url : 
		http://localhost:9009/update
		request header : Content-Type : application/json
		json to be sent in request body :-
				{
					"id" : 7,
					"name" : "shoes",
					"price" : 2750
				}
	 */
	@PutMapping(value = "/update")
	public HashMap<String, String> update(
	@RequestBody Product product) {
		HashMap<String, String> hmap = new HashMap<>();
		if(daoImpl.updateProduct(product)) {
			hmap.put("message", "success");
		} else {
			hmap.put("message", "error");
		}
		return hmap;
	}
	
	
	/*
	request method : DELETE
	request url : 
	http://localhost:9009/delete/7
	*/
	@DeleteMapping(value = "/delete/{pid}")
	public HashMap<String, String> delete(
	@PathVariable("pid") int id) {
		HashMap<String, String> hmap = new HashMap<>();
		if(daoImpl.deleteProduct(id)) {
			hmap.put("message", "success");
		} else {
			hmap.put("message", "error");
		}
		return hmap;
	}
}