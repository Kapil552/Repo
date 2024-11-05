package com.employeedemo.main;

import com.employeedemo.pojo.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"Amit","Hr");
		
		Employee e2=new Employee(2,"Sumit","Mechanical");
		
		System.out.println(e1);
		
		System.out.println(e1.equals(e2));
	}

}
