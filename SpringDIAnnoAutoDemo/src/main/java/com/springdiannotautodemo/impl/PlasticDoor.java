package com.springdiannotautodemo.impl;

import com.springdiannotautodemo.interfaces.Door;

public class PlasticDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("plastic door opened");
	}
}
