package com.springdiannotautodemo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdiannotautodemo.config.SpringConfig;
import com.springdiannotautodemo.entity.Car;

public class AppMain {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = 
		new AnnotationConfigApplicationContext(
				SpringConfig.class);
		
		Car metalCar = context.getBean(Car.class);
		metalCar.unlock();
	}
}
