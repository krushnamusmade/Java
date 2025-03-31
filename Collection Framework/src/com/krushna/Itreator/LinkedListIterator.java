package com.krushna.Itreator;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> student = new LinkedList<String>();
		
		student.add("Krushna");
		student.add("Aniket");
		student.add("Omkar");
		student.add("Sejal");
		System.out.println("Original student list : "+student);
		
		//Get the itreator from the linkedlist
		Iterator<String> iterator= student.iterator();
		
		//use the itreator to traverse the linkedlist
		System.out.println("Itreator thorught linkedlist");
		
		while(iterator.hasNext()) {
			String stu = iterator.next();
			System.out.println(stu);
			
			// remove sejal from list
			if(stu.equals("Sejal")) {
				iterator.remove();
			}
		}
		System.out.println("Linkedlist after removing Sejal : "+student);
	}

}
