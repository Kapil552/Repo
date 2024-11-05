package com.springdiannotdemo1.impl;

import com.springdiannotdemo1.interfaces.Door;

public class GlassDoor implements Door{

	@Override
	public void openDoor() {
		System.out.println("Glass Door Opened");
	}
}
