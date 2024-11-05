package com.springdiannotdemo.impl;

import com.springdiannotdemo.interfaces.Door;

public class PlasticDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("plastic door opened");
	}
}
