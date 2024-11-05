package com.springdiannotautodemo1.impl;

import com.springdiannotautodemo1.interfaces.Door;

public class GlassDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("Glass door opened");
	}
}
