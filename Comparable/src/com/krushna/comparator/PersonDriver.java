package com.krushna.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Krushna",23);
		Person p2 = new Person("Amit",24);
		Person p3 = new Person("Sejal",21);
		Person p4 = new Person("Akash",25);
		
		ArrayList<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
		
		
		//Sort by age
		Comparator<Person> age = new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getAge(), o2.getAge());
			}
		};
		Collections.sort(people,age);
		System.out.println("People in list : "+people);
		
		//sort by name
		Comparator<Person> name = new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(people,name);
		System.out.println("people in name sort : "+people);
	}

}
