package com.krushna.demo3;

public class Employee extends Company{
	
	Employee(String job){
		super("Test yantra");
		System.out.println("Job of Employee : "+job);
		System.out.println("Employee constructor");
	}

	@Override
	public String toString() {
		return "Employee [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
