package com.krushna.Abstract;

public class TomDriver {
	
	public static void main(String[] args) {
		Person t=new Tom();
		t.walk();
		t.run();
		
		//downcastin
		System.out.println(".....DownCasting.....");
		Tom tom = (Tom)t;
		tom.stop();
		tom.run();
		tom.walk();
	}

}
