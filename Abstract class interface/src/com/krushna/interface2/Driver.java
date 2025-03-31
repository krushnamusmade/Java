package com.krushna.interface2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Tom(); // upcasting
		person.eat();
		System.out.println("===============================");
		Tom tom = new Tom();
		tom.eat();
		tom.eating();
	}

}
