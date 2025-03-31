package com.krushna.Interface;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee dev = new Developer();
		dev.Work();
		System.out.println(Employee.id);
		dev.eat();
		
		
//		Developer dev1 = (Developer)dev;
//		dev1.Dev();
		System.out.println("==================================");
		Employee test = new Tester();
		System.out.println(test.id);
		test.Work();

	}

}
