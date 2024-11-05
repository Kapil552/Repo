package com.springjdbcdemo.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbcdemo.dao.ProductDao;
import com.springjdbcdemo.daoimpl.ProductDaoImpl;
import com.springjdbcdemo.pojo.Product;

public class AppMain {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext(
				"spring_config.xml");
		
		ProductDao daoImpl = context.getBean("daoImpl",
		ProductDaoImpl.class);
		
//		List<Product> lst = daoImpl.getAllProducts();
//		System.out.println("All products are :- ");
//		lst.forEach(System.out::println);
		
//		Product prd = daoImpl.searchProduct(7);
//		System.out.println(prd);
		
//		Product product = new Product();
//		product.setName("shoes");
//		product.setPrice(80000);
//		if(daoImpl.addNewProduct(product))
//			System.out.println("product saved");
//		else
//			System.out.println("product was not saved");
		
//		Product p1 = new Product();
//		p1.setId(9);
//		p1.setName("puma");
//		p1.setPrice(2700);
//		if(daoImpl.updateProduct(p1))
//			System.out.println("product was updated");
//		else
//			System.out.println("product updation failed or"
//					+ " no such product found");
		
		if(daoImpl.deleteProduct(9))
			System.out.println("product was deleted");
		else
			System.out.println("no such product found");
	}
}






