package com.collectiondemo.main;
import java.util.*;

import com.collectiondemo.pojo.Engine;

public class ListMain {

	public static void main(String[] args) {
		
		List<Engine> lst=new ArrayList<>();
	
		Engine e1=new Engine(1200,"Diesel");
		Engine e2=new Engine(1800,"Petrol");
		Engine e3=new Engine(1100,"cng");
		Engine e4=new Engine(800,"cng");
		
		lst.add(e3);
		lst.add(e2);
		lst.add(1,e1);
		lst.add(e4);
		
		System.out.println("All Engines from lst are: -");
		for(Engine e:lst)
			System.out.println(e);
		
		Engine e5=new Engine(800,"cng");
		
		System.out.println("is e5 present in list:" +lst.contains(e5));
		
		lst.remove(e5);
		lst.remove(0);
		
		System.out.println("After removal all engines from lst are: -");
		lst.forEach(System.out::println);
		
		//Array to list
		Integer[] arr= {10,20,30,40,50};
		List<Integer> mylist=Arrays.asList(arr);
		System.out.println("All numbers from mylist are: -");
		mylist.forEach(System.out::println);
		
		//List to Array
		List<String> slist=new ArrayList<>();
		slist.add("ABC");
		slist.add("PQR");
		slist.add("XYZ");
		Object[] ar=slist.toArray();
		System.out.println("All elements from ar are:- ");
		for(Object obj: ar)
			System.out.println(obj);
	}

}
