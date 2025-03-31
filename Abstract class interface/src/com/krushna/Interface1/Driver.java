package com.krushna.Interface1;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tom tom = new Tom();
		
		tom.learnDevelop();
		tom.learnTesting();
		tom.shop();
		
		FirstBitSolution first = new Tom(); //upcasting
		first.learnTesting();

		
		Tom t = (Tom)first; //Downcasting
		t.learnDevelop();
		t.learnTesting();
		t.shop();
		t.outPut();
	

	}

}
