package com.springdidemo1.pojo;

import com.springdidemo1.interfaces.Door;

public class Car {

	private Door door;

	public Car() {
	}

	//constructor dependency injection
	public Car(Door door) {
		this.door = door;
	}

	//setter dependency injection
	public void setDoor(Door door) {
		this.door = door;
	}
	
	public void unlock() {
		door.openDoor();
	}
}
