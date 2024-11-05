package com.springdidemo1.impl;

import com.springdidemo1.interfaces.Door;

public class GlassDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("Glass Door opened");
	}
}
