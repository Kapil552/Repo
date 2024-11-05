package com.collectiondemo.main;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
	
		LinkedList<Integer> lst =new LinkedList<>();
		
		lst.add(123);
		lst.add(335);
		lst.add(999);
		lst.add(234);
		lst.add(787);
		lst.add(625);

		lst.addFirst(111);
		lst.addLast(999);
		
		System.out.println("All elements from lst are:-");
		Iterator<Integer> it=lst.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
			lst.remove();
			lst.removeFirst();
			lst.removeLast();
			
			System.out.println("After removal all elements are:-");
			lst.forEach(System.out::println);
			
			System.out.println("result of peekFirst: " +lst.peekFirst());
			System.out.println("result of peekLast: " +lst.peekLast());
			System.out.println("result of pollFist: " +lst.pollFirst());
			System.out.println("result of pollLast: " +lst.pollLast());
			
			System.out.println("After polling, all elements are:- ");
			lst.forEach(System.out::println);
	}
}
