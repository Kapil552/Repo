package com.arraaylistdemo.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.arraylistdemo.pojo.Engine;


class ListMain {

	public static void main(String[] args) {
	
		List<Engine> lst=new LinkedList<>();
		
		Engine e1=new Engine(1200,"diesel");
		Engine e2=new Engine(1800,"petrol");
		Engine e3=new Engine(1100,"cng");
		Engine e4=new Engine(800,"cng");
		
		lst.add(e3);
		lst.add(e2);
		lst.add(1, e1);
		lst.add(e4);
		
		System.out.println("All Engines from lst are:- ");
		lst.forEach(System.out::println);
		
		Engine e5=new Engine(1800,"petrol");
		
		System.out.println("is e present in lst:" +lst.contains(e5));
		
		lst.remove(e5);
		lst.remove(0);
		
		System.out.println("After removal all engine from lst are:- ");
		lst.forEach(System.out::println);
		
		//Array to List
		Integer[] arr= {10,20,30,40,50};
		List<Integer> myList=Arrays.asList(arr);
		System.out.println("All numbers from mylist are:- ");
		myList.forEach(System.out::println);
		
		//List to Array
		List<String> slist=new ArrayList<>();
		slist.add("ABC");
		slist.add("PQR");
		slist.add("XYZ");
		Object[] ar=slist.toArray();
		
		System.out.println("All elements from ar are:-");
		for(Object obj:ar)
			System.out.println(obj);
	}
}
