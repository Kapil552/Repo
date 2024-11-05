package com.springdiannotautodemo1.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springdiannotautodemo1.interfaces.Door;

@Component
public class Car {
	
	private Door door;

	//constructor dependency injection
	@Autowired
	public Car(Door door) {
		this.door = door;
	}

	public Car() {
	}

	//setter dependency injection
	public void setDoor(Door door) {
		this.door = door;
	}
	
	public void unlock() {
		door.openDoor();
	}
}
