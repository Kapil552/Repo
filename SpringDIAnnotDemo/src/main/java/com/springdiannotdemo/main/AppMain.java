package com.springdiannotdemo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdiannotdemo.config.SpringConfig;
import com.springdiannotdemo.entity.Car;

public class AppMain {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = 
		new AnnotationConfigApplicationContext(
				SpringConfig.class);
		
		Car glassCar = context.getBean("gCar", Car.class);
		glassCar.unlock();
		
		Car plasticCar = context.getBean("pCar", Car.class);
		plasticCar.unlock();
		
		Car metalCar = context.getBean("mCar", Car.class);
		metalCar.unlock();
	}
}
