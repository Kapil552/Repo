package com.manytomanybidemo1.pojo;

import java.util.Set;

import com.manytomanybidemo1.pojo.Course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@Column(name="id")
	private int studentId;
	
	@Column(name="name")
	private String studentName;
	
	@ManyToMany
	@JoinTable(name = "stud_course" , joinColumns = 
	@JoinColumn(name = "sid" , referencedColumnName = "id") , 
	inverseJoinColumns = @JoinColumn(name = "cid" , 
	referencedColumnName = "id"))
	private Set<Course> courses;
	
	public Student() {
	}

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

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
}
