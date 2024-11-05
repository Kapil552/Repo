package com.springdidemo1.impl;

import com.springdidemo1.interfaces.Door;

public class PlasticDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("Plastic Door opened");
	}
}
