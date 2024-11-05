package com.springdiannotdemo1.impl;

import com.springdiannotdemo1.interfaces.Door;

public class PlasticDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("plastic door opened");
	}
}
