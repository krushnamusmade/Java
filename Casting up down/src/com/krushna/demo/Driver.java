package com.krushna.demo;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father father = new Son(); //UpCasting
		System.out.println(father.age);
		System.out.println("============================");
		Son son = (Son) father; // DownCasting
		System.out.println(son.age);
		System.out.println(son.name);

	}

}
