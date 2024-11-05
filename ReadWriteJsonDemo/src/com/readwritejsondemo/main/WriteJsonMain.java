package com.readwritejsondemo.main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.readwritejsondemo.entity.Car;
import com.readwritejsondemo.entity.Engine;

public class WriteJsonMain {

	public static void main(String[] args) {
	
		Gson g = new Gson();
		
		Engine e1 = new Engine(1200, "petrol", "kappa");
		Car c1 = new Car("hyundai", "i10", 650000, e1);
		
		System.out.println("generated json object : " + 
		g.toJson(c1));
		
		Engine e2 = new Engine(1400, "petrol", "k-series");
		Car c2 = new Car("maruti", "ciaz", 1120000, e2);
		
		List<Car> carList = new ArrayList<Car>();
		carList.add(c1);
		carList.add(c2);
		
		System.out.println("Generated json array : " +
		g.toJson(carList));
		
		String jsonData = g.toJson(carList);
		
		try(FileWriter writer = new FileWriter("/home/"
		+ "administrator/19thFeb24AdvJava/mydata.txt")) {
			writer.write(jsonData);
			System.out.println("json saved into the file");
		} catch(IOException exc) {
			exc.printStackTrace();
		}
	}
}






