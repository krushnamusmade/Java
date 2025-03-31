package com.krushna.Vector;

import java.util.Vector;

public class VectorSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> fruits = new Vector<String>();
		
		//add elements
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Stwabarry");
		fruits.add("Apple");
		System.out.println("Vector List : "+fruits);

		//add element in index
		fruits.add(3,"PineApple");
		System.out.println("List : "+fruits);
		
		//size
		System.out.println("List : "+fruits.size());
		
		//get index elements
		String get = fruits.get(0);
		System.out.println("List : "+get);
		
		//set element
		fruits.set(4, "Orange");
		System.out.println("List " +fruits);
		
		//remove index
		fruits.remove(0);
		System.out.println("List : "+fruits);
		
		//remove element
		fruits.remove("Orange");
		System.out.println("List : "+fruits);
		
		//is epmty
		boolean check = fruits.isEmpty();
		System.out.println("List : "+check);
		
		//element present return true
		boolean ch = fruits.contains("PineApple");
		System.out.println("List : "+ch);
		
		//clear list
		fruits.clear();
		System.out.println("List : "+fruits);
		
		
	}

}
