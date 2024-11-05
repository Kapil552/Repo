package com.st.springsecdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.springsecdemo.model.Student;
import com.st.springsecdemo.service.StudentServices;

@RestController
@RequestMapping(name="/student")
public class StudentController {

	@Autowired
	StudentServices studentService;
	
	//API's Services for all student details
	@GetMapping("/")
	public List<Student> getAllStudent(){
		
		return this.studentService.getAllStudent();
	}
	
	//API's Services for only one student
	@GetMapping("/{studentName}")
	public Student getStudent(@PathVariable("studentName")String studentName) {
		
		return this.studentService.getStudent(studentName);
	}
}
