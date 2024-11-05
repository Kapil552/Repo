package com.tableperclassdemo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "fourwheeler")
public class FourWheeler extends Vehicle {

	private String steering;

	public FourWheeler() {
	}

	public String getSteering() {
		return steering;
	}

	public void setSteering(String steering) {
		this.steering = steering;
	}
}
