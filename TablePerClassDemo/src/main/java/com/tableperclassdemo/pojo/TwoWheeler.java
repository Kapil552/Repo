package com.tableperclassdemo.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "twowheeler")
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
