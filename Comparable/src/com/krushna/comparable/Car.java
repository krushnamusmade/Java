package com.krushna.comparable;

public class Car implements Comparable<Car> {
	
	private String brand;
	private String color;
	private int price;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.price, o.price);
		
	}


//	@Override
//	public int compareTo(Car other) {
//		// TODO Auto-generated method stub
//		return Integer.compare(this.price, other.price);
//	}

	
	
	
	

}
