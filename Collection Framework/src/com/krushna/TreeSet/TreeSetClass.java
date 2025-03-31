package com.krushna.TreeSet;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> num = new TreeSet<Integer>();
		
		//add element
		num.add(10);
		num.add(10);
//		num.add(null);
//		num.add(null);  // null element not accept
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		System.out.println("set : "+num);
		
		//elemet present or not
		System.out.println("set elemet preset 40 : "+num.contains(40));
		
		//first element in set
		System.out.println("Set first : "+num.first());
		
		//last elemet in set
		System.out.println("set last : "+num.last());
		
		//size
		System.out.println("Size : "+num.size());

		//is empty
		System.out.println("set isEmpty : "+num.isEmpty());
	}

}
