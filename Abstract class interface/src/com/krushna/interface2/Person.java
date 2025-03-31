package com.krushna.interface2;

public interface Person {

	void eat();
   
	default void eating() {
		System.out.println("Eaating Jevan");
	}
}
