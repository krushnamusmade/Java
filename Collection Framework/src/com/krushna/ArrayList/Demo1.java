package com.krushna.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(85);
		num.add(68);
		num.add(78);
		num.add(96);
		num.add(88);
		
		System.out.println("Number list : "+num);
		
		for(Integer number : num) {
			System.out.println("Number : "+number);
		}
		
		LinkedList<String> student = new LinkedList<String>();
		student.add("Krushna musmade");
		student.add("Aniket khurud");
		student.add("Omkar mahankal");
		student.add("Sejal tarade");
		System.out.println("Student List : "+student);
		
		for(String stu : student) {
			System.out.println("Student name : " +stu);
		}

	}

}
