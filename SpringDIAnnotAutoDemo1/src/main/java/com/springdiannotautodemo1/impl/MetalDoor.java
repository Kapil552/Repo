package com.springdiannotautodemo1.impl;

import org.springframework.stereotype.Component;

import com.springdiannotautodemo1.interfaces.Door;

@Component
public class MetalDoor implements Door{
	
	@Override
	public void openDoor() {
		System.out.println("metal door opened");
	}
}
