package com.springdidemo1.impl;

import com.springdidemo1.interfaces.Door;

public class MetalDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("Metal Door opened");
	}
}
