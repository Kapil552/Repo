package com.springdidemo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdidemo.entity.Car;

public class AppMain {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("spring_config.xml");
		
		Car metalCar = context.getBean("mCar", Car.class);
		metalCar.unlock();
		
		Car glassCar = context.getBean("gCar", Car.class);
		glassCar.unlock();
		
		Car plasticCar = context.getBean("pCar", Car.class);
		plasticCar.unlock();
	}
}
