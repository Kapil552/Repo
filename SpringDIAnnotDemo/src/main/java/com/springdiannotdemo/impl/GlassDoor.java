package com.springdiannotdemo.impl;

import com.springdiannotdemo.interfaces.Door;

public class GlassDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("glass door opened");
	}
}
