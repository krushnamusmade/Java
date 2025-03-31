package com.krushna.array;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter size of student : ");
		int size = sc.nextInt();
		
		Student[] stu = new Student[size];
		
		System.out.println("Insert student information");
		for(int i=0;i<stu.length;i++) {
			
			System.out.print("Enter id : ");
			int id = sc.nextInt();
			
			sc.nextLine(); // Consume the newline character before reading the name
			System.out.print("Enter Name : ");
			String name = sc.nextLine();
			
			System.out.print("Enter age : ");
			int age = sc.nextInt();
			
			System.out.print("Enter mark : ");
			int mark = sc.nextInt();
			
			stu[i] = new Student(id,name,age,mark);
		}
		
		for(Student student : stu) {
			System.out.println(student);
		}

	}

}
