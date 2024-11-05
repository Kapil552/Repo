package com.mavenproject.pojo;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	
	@Column(name="name")
	private String pname;
	
	private int price;

	public Product() {
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
}
