package com.krushna.demo2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("UpCating");
		Vechicle v = new Car("AuDi","Q8"); // UpCasting
		v.display();
		
		System.out.println("DownCastig");
		Car c = (Car) v;
		c.displayCar();
		
		System.out.println("========================================================================");
		System.out.println("UpCasting");
		Vechicle ve = new Bike("Honda",87000);
		ve.display();
		System.out.println("DownCasting");
		Bike bike = (Bike) ve;
		bike.displayBike();
		

	}

}
