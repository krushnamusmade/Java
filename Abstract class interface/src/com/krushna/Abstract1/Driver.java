package com.krushna.Abstract1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vechicel bike = new Bike();
		bike.start();
		bike.shiftGear();
		System.out.println("==========================================");
		Vechicel car = new Car();
		car.start();
		car.shiftGear();
	}

}
