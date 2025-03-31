package com.krushna.demo2;

public class Bike extends Vechicle {
	private int price;

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(String brand,int price) {
		super(brand);
		// TODO Auto-generated constructor stub
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void displayBike() {
		display();
		System.out.println("Price : "+this.getPrice());
	}
	
	

}
