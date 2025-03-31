package com.krushna.LinkedList;

import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		//Add Eelement
		list.add("Apple");
		list.add("Banana");
		list.add("Watermelone");
		list.add("Orange");
		list.add("Apple");
		System.out.println("List : "+list);
		
		//add element in specific index
		list.add(2,"Mango");
		System.out.println("List : "+list);
		
		//get specific index element
		String li = list.get(2);
		System.out.println("List : "+li);
		
		//set or replace element
		list.set(3, "PineApple");
		System.out.println("List : "+list);
		
		//remove element by index
		list.remove(3);
		System.out.println("List : "+list);
		
		//add first elements in list
		list.addFirst("Strawberray");
		System.out.println("List : "+list);
		
		//last in element in list
		list.addLast("Chochalate");
		System.out.println("List : "+list);
		
		//remove first in index
		list.removeFirst();
		System.out.println("List : "+list);
		
		//remove last in index
		list.removeLast();
		System.out.println("List : "+list);
		
		//first element in list
		String first = list.getFirst();
		System.out.println("List : "+first);
		
		//last element in list
		String last = list.getLast();
		System.out.println("List : "+last);
		
		//check empty
		boolean lis = list.isEmpty();
		System.out.println("List : "+lis);
		
		//element present or not
		boolean boo = list.contains("Apple");
		System.out.println("List : "+boo);
		
		//clear list
		list.clear();
		System.out.println("List : "+list);
		
	
		
	
	}

}
