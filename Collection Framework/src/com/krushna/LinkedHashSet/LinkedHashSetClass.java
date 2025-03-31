package com.krushna.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> number = new LinkedHashSet<Integer>();
		
		//add elements
		number.add(10);
		number.add(10);
		number.add(null);
		number.add(null);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		number.add(60);
		System.out.println("Number set : "+number);
		
		//remove element
		number.remove(null);
		System.out.println("Set : "+number );
		
		//element present or not
		System.out.println("Set number present 40 : "+number.contains(60));
		
		//size
		System.out.println("set size : "+number.size());
		
		//clear
		number.clear();
		System.out.println("set clear : "+number);
		
		//isEmpty
		System.out.println("set isEmpty : "+number.isEmpty());

	}

}
