package com.springdidemo.impl;

import com.springdidemo.interfaces.Door;

public class PlasticDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("plastic door opened");
	}
}
