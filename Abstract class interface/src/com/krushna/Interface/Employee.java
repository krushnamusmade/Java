package com.krushna.Interface;

public interface Employee {
	 int id = 201;
	public void Work();
	default void eat() {
		System.out.println("Ky Karto Bhava");
	}
}
