package com.joineddemo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "twowheeler")
@PrimaryKeyJoinColumn(name = "id" , referencedColumnName = "id")
public class TwoWheeler extends Vehicle {

	private String handle;

	public TwoWheeler() {
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}
}
