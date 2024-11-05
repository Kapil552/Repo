package com.springdidemo2.entity;

import java.util.List;

public class ClassRoom {

	private List<String> studentNames;

	public ClassRoom(List<String> studentNames) {
		this.studentNames = studentNames;
	}

	public List<String> getStudentNames() {
		return studentNames;
	}

	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}
}
