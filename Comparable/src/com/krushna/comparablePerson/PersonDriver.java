package com.krushna.comparablePerson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PersonDriver extends Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person("krushna",23);
		Person p1 = new Person("Akash",24);
		Person p2 = new Person("Sushil",22);
		ArrayList<Person> person = new ArrayList<Person>();
		person.add(p);
		person.add(p1);
		person.add(p2);
		
		Collections.sort(person);
		System.out.println("Person : "+person);
		
	}

}
