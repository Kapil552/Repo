package com.springdiannotautodemo1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdiannotautodemo1.config.SpringConfig;
import com.springdiannotautodemo1.entity.Car;

public class AppMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Car metalCar=context.getBean(Car.class);
		metalCar.unlock();
	
	}
}
