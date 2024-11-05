package com.springdiannotdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.springdiannotdemo.entity.Car;
import com.springdiannotdemo.impl.GlassDoor;
import com.springdiannotdemo.impl.MetalDoor;
import com.springdiannotdemo.impl.PlasticDoor;
import com.springdiannotdemo.interfaces.Door;

@Configuration
public class SpringConfig {

	@Bean("md")
	public Door getMetalDoor() {
		return new MetalDoor();
	}
	
	@Bean("gd")
	public Door getGlassDoor() {
		return new GlassDoor();
	}
	
	@Bean("pd")
	public Door getPlasticDoor() {
		return new PlasticDoor();
	}
	
	@Bean(name="mCar")
	@Scope("prototype")
	public Car getMetalCar() {
		Car car = new Car(getMetalDoor());
		return car;
	}
	
	@Bean("gCar")
	public Car getGlassCar() {
		Car car = new Car(getGlassDoor());
		return car;
	}
	
	@Bean("pCar")
	public Car getPlasticCar() {
		Car car = new Car();
		car.setDoor(getPlasticDoor());
		return car;
	}
}











