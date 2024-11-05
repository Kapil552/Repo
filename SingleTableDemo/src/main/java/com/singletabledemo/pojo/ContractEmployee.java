package com.singletabledemo.pojo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ce")
public class ContractEmployee extends Employee {

	private String site;

	public ContractEmployee() {
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
}
