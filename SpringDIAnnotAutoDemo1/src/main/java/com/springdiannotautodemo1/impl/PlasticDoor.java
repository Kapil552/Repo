package com.springdiannotautodemo1.impl;

import com.springdiannotautodemo1.interfaces.Door;

public class PlasticDoor implements Door{

	@Override
	public void openDoor() {
		System.out.println("Plastic door opened");
	}
}
