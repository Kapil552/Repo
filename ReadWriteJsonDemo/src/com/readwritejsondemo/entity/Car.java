package com.readwritejsondemo.entity;

public class Car {

	private String brand;
	private String model;
	private int price;
	private Engine engine;
	
	public Car(String brand, String model, int price, Engine engine) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.engine = engine;
	}

	public Car() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
