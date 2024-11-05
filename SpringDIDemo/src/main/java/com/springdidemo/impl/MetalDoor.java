package com.springdidemo.impl;

import com.springdidemo.interfaces.Door;

public class MetalDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("metal door opened");
	}
}
