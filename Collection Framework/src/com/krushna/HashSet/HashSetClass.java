package com.krushna.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> student = new HashSet<String>();
		
		//Add element
		student.add("krushna musmade");
		student.add("aniket khurud");
		student.add("omkar mahankal");
		student.add("rahul kadu");
		student.add("krushna musmade"); // ignore 
		student.add(null);
		student.add(null); //ignore  only on null value accepted
		System.out.println("set is : "+student);
		
		//remove object
		student.remove("aniket khurud");
		System.out.println("set is : "+student);
		
		//present element or not
		boolean stu = student.contains("rahul kadu");
		System.out.println("set element preset or not : "+stu);
		
		//size
		System.out.println("set size : "+student.size());
		
		//isempty
		boolean  check = student.isEmpty();
		System.out.println("set isEmpty : "+check);
		
		//clear
		student.clear();
		System.out.println("Set is : "+student);
	}

}
