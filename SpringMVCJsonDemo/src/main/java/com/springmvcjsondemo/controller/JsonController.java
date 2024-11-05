package com.springmvcjsondemo.controller;

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

import com.springmvcjsondemo.dao.ProductDao;
import com.springmvcjsondemo.pojo.Product;

@Controller
public class JsonController {

	private ProductDao daoImpl;

	@Autowired
	public void setDaoImpl(ProductDao daoImpl) {
		this.daoImpl = daoImpl;
	}
	
	/*
		request method : GET
		request url : 
		http://localhost:8080/SpringMVCJsonDemo/getall
	*/
	@GetMapping(value = "/getall" , 
	produces = "application/json")
	public @ResponseBody List<Product> getAll() {
		List<Product> lst = daoImpl.getAllProducts();
		return lst;
	}
	
	/*
		request method : GET
		request url : 
		http://localhost:8080/SpringMVCJsonDemo/search?pid=3
	*/
	@GetMapping(value = "/search" , 
	produces = "application/json")
	public @ResponseBody Product getdata(
	@RequestParam("pid") int id) {
		Product product = daoImpl.searchProduct(id);
		return product;
	}
	
	/*
		request method : POST
		request url : 
		http://localhost:8080/SpringMVCJsonDemo/add
		request header : Content-Type : application/json
		json to be sent in request body :-
				{
					"name" : "shoes",
					"price" : 80000
				}
	*/
	@PostMapping(value = "/add", produces = 
	"application/json")
	public @ResponseBody HashMap<String, String> add(
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
		http://localhost:8080/SpringMVCJsonDemo/update
		request header : Content-Type : application/json
		json to be sent in request body :-
				{
					"id" : 7,
					"name" : "shoes",
					"price" : 2750
				}
	 */
	@PutMapping(value = "/update", produces = 
	"application/json")
	public @ResponseBody HashMap<String, String> update(
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
	http://localhost:8080/SpringMVCJsonDemo/delete/7
	*/
	@DeleteMapping(value = "/delete/{pid}", produces = 
	"application/json")
	public @ResponseBody HashMap<String, String> delete(
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



