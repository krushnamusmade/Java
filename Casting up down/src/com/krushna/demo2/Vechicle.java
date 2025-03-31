package com.krushna.demo2;

public class Vechicle {
	protected String brand;
	
	public Vechicle() {
		// TODO Auto-generated constructor stub
	}

	public Vechicle(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void display() {
		System.out.println("Brand : "+this.getBrand());
	}
	
}
