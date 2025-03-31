package com.krushna.demo2;

public class Car extends Vechicle{
	
	private String model;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String brand,String model) {
		super(brand);
		// TODO Auto-generated constructor stub
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void displayCar() {
		display();
		System.out.println("Model : "+this.getModel());
	}
	
	

}
