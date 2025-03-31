package com.krushna.ArrayList;

import java.util.ArrayList;

import java.util.Collections;

public class Demo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Adding element in list");
		list.add("Krushna");
		list.add("Sejal");
		list.add("Kiran");
		list.add("kunal");
		System.out.println("All elements in list : "+list);
		System.out.println();
		
		list.add(2,"Ankita");
		System.out.println("Add sepecific postion : "+list );
		System.out.println();
		
		Collections.sort(list);
		System.out.println("sort list : "+list);
		System.out.println();
		
		System.out.println("Get index elements 4: "+list.get(4));
		System.out.println("List : "+list);
		System.out.println();
		
		list.set(1, "Divya");
		System.out.println("Replace 1 postion in list : "+list);
		System.out.println();
		
		System.out.println("Remove index access : "+list.remove(2));
		System.out.println("list :" +list);
		System.out.println();
		
		System.out.println("Remove object in list : "+list.remove("Krushna"));
		System.out.println("list : "+list);
		System.out.println();
		
		System.out.println("Size of list : "+list.size());
		System.out.println("list : "+list);
		System.out.println();
		
		list.clear();
		System.out.println("Clear list : "+list);
		System.out.println();
		
		boolean li = list.isEmpty();
		System.out.println("list is empty : "+li);
	}

}
