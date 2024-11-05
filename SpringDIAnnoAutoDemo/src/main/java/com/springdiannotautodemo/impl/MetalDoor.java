package com.springdiannotautodemo.impl;

import org.springframework.stereotype.Component;

import com.springdiannotautodemo.interfaces.Door;

@Component
public class MetalDoor implements Door {

	@Override
	public void openDoor() {
		System.out.println("metal door opened");
	}
}
