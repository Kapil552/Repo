package com.springdiannotdemo1.impl;

import com.springdiannotdemo1.interfaces.Door;

public class MetalDoor implements Door{

	@Override
	public void openDoor() {
		System.out.println("Metal Door Opened");
	}
}
