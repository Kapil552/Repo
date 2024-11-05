package com.joineddemo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "fourwheeler")
@PrimaryKeyJoinColumn(name = "id" , referencedColumnName = "id")
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
