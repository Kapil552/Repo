package com.springdiannotdemo1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdiannotdemo1.config.SpringConfig;
import com.springdiannotdemo1.entity.Car;

public class AppMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Car glassCar=context.getBean("gCar",Car.class);
		glassCar.unlock();
		
		Car plascticCar=context.getBean("pCar",Car.class);
		plascticCar.unlock();
		
		Car metalCar=context.getBean("mCar",Car.class);
		metalCar.unlock();
	}

}
