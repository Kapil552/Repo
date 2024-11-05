package com.springdiannotautodemo.impl;

import org.springframework.stereotype.Component;

import com.springdiannotautodemo.interfaces.Door;

//@Component
public class GlassDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("glass door opened");
	}
}
