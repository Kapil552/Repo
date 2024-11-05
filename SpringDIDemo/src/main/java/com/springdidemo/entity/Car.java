package com.springdidemo.entity;

import com.springdidemo.interfaces.Door;

public class Car {

	private Door door;
	
	//constructor dependency injection
	public Car(Door door) {
		this.door = door;
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
