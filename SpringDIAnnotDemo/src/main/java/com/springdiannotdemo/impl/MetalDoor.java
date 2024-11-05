package com.springdiannotdemo.impl;

import com.springdiannotdemo.interfaces.Door;

public class MetalDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("metal door opened");
	}
}
