package com.springdiannotdemo.entity;

import com.springdiannotdemo.interfaces.Door;

public class Car {

	private Door door;
	
	//constructor dependency injection
	public Car(Door door) {
		this.door = door;
		System.out.println("parameterized constructor called");
	}
	
	public Car() {}
	
	//setter dependency injection
	public void setDoor(Door door) {
		this.door = door;
	}

	public void unlock() {
		door.openDoor();
	}
}
