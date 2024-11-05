package com.springdiannotdemo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.springdiannotdemo1.entity.Car;
import com.springdiannotdemo1.impl.GlassDoor;
import com.springdiannotdemo1.impl.MetalDoor;
import com.springdiannotdemo1.impl.PlasticDoor;
import com.springdiannotdemo1.interfaces.Door;

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
		Car car=new Car(getMetalDoor());
		return car;
	}
	
	@Bean("gCar")
	public Car getGlassCar() {
		Car car=new Car(getGlassDoor());
		return car;
	}
	
	@Bean("pCar")
	public Car getPlasticCar() {
		Car car=new Car(getPlasticDoor());
		car.setDoor(getPlasticDoor());
		return car;
	}
}
