package com.collectiondemo.comparator;

import java.util.Comparator;

import com.collection.pojo.Employee;

public class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getId()-o2.getId();
	}
		
	
}
