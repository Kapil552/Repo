package com.collectiondemo.main;

import java.util.TreeSet;

import com.collectiondemo.comparator.IdComparator;
import com.collectiondemo.comparator.NameComparator;
import com.collectiondemo.pojo.Employee;
import com.collectiondemo.pojo.Student;

public class SortingMain {

	public static void main(String[] args) {
	
		TreeSet<Student> tset = new TreeSet<>();
		
		Student s1 = new Student(21, "XYZ");
		Student s2 = new Student(23, "ABC");
		Student s3 = new Student(22, "PQR");
		
		tset.add(s1);
		tset.add(s2);
		tset.add(s3);
		
		System.out.println("All students from tset are :- ");
		tset.forEach(System.out::println);
		
		Employee e1 = new Employee(1233, "ABC");
		Employee e2 = new Employee(1231, "XYZ");
		Employee e3 = new Employee(1232, "LMN");

//		TreeSet<Employee> eset = new TreeSet<>(
//		new NameComparator());
		
		TreeSet<Employee> eset = new TreeSet<>(
		new IdComparator());
		
		eset.add(e1);
		eset.add(e2);
		eset.add(e3);
		
		System.out.println("All employees are :- ");
		eset.forEach(System.out::println);
	}
}





