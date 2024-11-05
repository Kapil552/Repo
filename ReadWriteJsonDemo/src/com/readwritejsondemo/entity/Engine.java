package com.readwritejsondemo.entity;

public class Engine {

	private int capacity;
	private String fuel;
	private String code;
	
	public Engine(int capacity, String fuel, String code) {
		this.capacity = capacity;
		this.fuel = fuel;
		this.code = code;
	}

	public Engine() {
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
