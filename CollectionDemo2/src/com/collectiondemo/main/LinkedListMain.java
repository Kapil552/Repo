package com.collectiondemo.main;

import java.util.*;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList<Integer> lst=new LinkedList<>();
		
		lst.add(123);
		lst.add(335);
		lst.add(999);
		lst.add(234);
		lst.add(787);
		lst.add(234);
		
		lst.addFirst(111);
		lst.addLast(999);
		
		System.out.println("All elements from lst are: -");
		lst.forEach(System.out::println);
		
		lst.remove();
		lst.removeFirst();
		lst.removeLast();
		
		System.out.println("After Removal all elements are: -");
		lst.forEach(System.out::println);
		
		System.out.println("result of peekFirst():" +lst.peekFirst());
		System.out.println("result of pollFirst():" +lst.pollFirst());
		
		System.out.println("After Polling all elements are: -");
		lst.forEach(System.out::println);
	}

}
