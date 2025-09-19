package com.krushna.comparablePerson;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, o.age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}
	
	

}
