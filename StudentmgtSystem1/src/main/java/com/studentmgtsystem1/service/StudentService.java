package com.studentmgtsystem1.service;

import java.util.List;

import com.studentmgtsystem1.entity.Student;

public interface StudentService {

	List<Student> getAllStudent(); // un-implemented method

	public Student saveNewStudent(Student student); // Service method for save new students
}
