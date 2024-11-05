package com.st.springsecdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.st.springsecdemo.model.Student;

@Service
public class StudentServices {

	//use list 
	List<Student> list=new ArrayList<>();
	
	//student service
	public StudentServices() {
		
		list.add(new Student(101,"Ramesh", "BCA", "ramesh@gmail.com"));
		list.add(new Student(102,"Suresh", "DCA", "suresh@gmail.com"));
	}
		//API for getting all students
		public List<Student> getAllStudent() {
			
			return list;
		}
		
		//API for getting single student by name
		public Student getStudent(String studentName) {
			return this.list.stream().filter((student)->student.getStudentName().equals(studentName)).findAny().orElse(null);
		}
	}

