package com.st.springsecdemo.model;

//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;

//@NoArgsConstructor
//@AllArgsConstructor
public class Student {

	int studentId;
	String studentName;
	String studentEnrollCourse;
	String studentEmail;
	
	//default constructor
	public Student() {
	}
	
	//parameterized constructor
	public Student(int studentId, String studentName, 
			String studentEnrollCourse, String studentEmail) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEnrollCourse = studentEnrollCourse;
		this.studentEmail = studentEmail;
	}
	
	//getters and setters methods
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEnrollCourse() {
		return studentEnrollCourse;
	}
	public void setStudentEnrollCourse(String studentEnrollCourse) {
		this.studentEnrollCourse = studentEnrollCourse;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
}
