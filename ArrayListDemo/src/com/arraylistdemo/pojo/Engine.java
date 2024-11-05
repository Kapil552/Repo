package com.arraylistdemo.pojo;

import java.util.Objects;

public class Engine {
	
	private int capacity;
	private String fuel;
	
	public Engine() {
	}

	public Engine(int capacity, String fuel) {
		this.capacity = capacity;
		this.fuel = fuel;
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

	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", fuel=" + fuel + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacity, fuel);
	}

	@Override
	public boolean equals(Object obj) {
		Engine other = (Engine) obj;
		return capacity == other.capacity && Objects.equals(fuel, other.fuel);
	}
	
	
}
