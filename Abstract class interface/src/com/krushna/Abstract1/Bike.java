package com.krushna.Abstract1;

public class Bike extends Vechicel{
	
	public void start() {
		System.out.println("Bike Start");
	}

	@Override
	public void shiftGear() {
		// TODO Auto-generated method stub
		System.out.println("Manual Gear");
	}

}
