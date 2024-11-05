package com.collectiondemo.main;

import java.util.HashSet;
import java.util.Set;

import com.collection.pojo.Engine;

public class SetMain {

	public static void main(String[] args) {
		
		Set<Engine> eset=new HashSet<>();
		
		Engine e1=new Engine(1200,"diesel");
		Engine e2=new Engine(1800,"petrol");
		Engine e3=new Engine(1100,"cng");
		
		eset.add(e1);
		eset.add(e3);
		eset.add(e2);
		
		System.out.println("All Engines from eset are:- ");
		eset.forEach(System.out::println);
		
		Engine e4=new Engine(1800,"petrol");
		eset.add(e4);
		
		System.out.println("now, all engines from eset are:- ");
		eset.forEach(System.out::println);

	}

}
