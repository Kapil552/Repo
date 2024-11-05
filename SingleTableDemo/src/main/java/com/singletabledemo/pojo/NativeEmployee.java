package com.singletabledemo.pojo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ne")
public class NativeEmployee extends Employee {

	private String office;

	public NativeEmployee() {
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
}
