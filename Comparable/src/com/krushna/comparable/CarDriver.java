package com.krushna.comparable;

import java.util.TreeSet;

public class CarDriver extends Car{
	
	public static void main(String[] args) {
		Car c = new Car("BMW","Black",50000);
		Car c1 = new Car("Mahindra","Black",40000);
		Car c2 = new Car("TaTa","Harriar",45000);
		
		TreeSet<Car> t = new TreeSet<Car>();
		t.add(c);
		t.add(c1);
		t.add(c2);
		
		for(Car car: t) {
			System.out.println("Car : "+car);
		}
	}

}
