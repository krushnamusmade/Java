package com.krushna.Abstract;

public class Tom extends Person{
	
	String name;
	
	public Tom() {
		// TODO Auto-generated constructor stub
	}
	

	public Tom(String name) {
		super();
		this.name = name;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walking");
	}
	
	public void run() {
		System.out.println("Tom Running");
	}
	
	public void stop() {
		System.out.println("Tom is sick");
	}

}
