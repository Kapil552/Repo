package com.springdidemo2.entity;

public class Container {

	private ABC ref1;
	private PQR ref2;
	
	public Container(ABC ref1, PQR ref2) {
		this.ref1 = ref1;
		this.ref2 = ref2;
	}

	public Container() {
	}

	public ABC getRef1() {
		return ref1;
	}

	public void setRef1(ABC ref1) {
		this.ref1 = ref1;
	}

	public PQR getRef2() {
		return ref2;
	}

	public void setRef2(PQR ref2) {
		this.ref2 = ref2;
	}
}
