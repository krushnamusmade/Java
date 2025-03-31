package com.krushna.Stack;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> numbers = new Stack<Integer>();
		  
		//add elements
		numbers.push(10);
		numbers.push(20);
		numbers.push(30);
		numbers.push(40);
		numbers.add(null);
		numbers.add(null);
		numbers.push(50);
		numbers.push(60);
		System.out.println("Stack Numbers : "+numbers);
		
		//POP=> remove and return the item at the top the stack
		System.out.println("pop number : "+numbers.pop());
		System.out.println("Stack Number : "+numbers);
	
		// peek => peek return top element in stack
		System.out.println("peek number(top number) : "+numbers.peek());
		//System.out.println("Stack number : "+numbers);

		//search(object) => search in stack
		System.out.println("Search in stack : "+ numbers.search(20));
		
		//empty => return true is stack is empty
		System.out.println("Stack is empty : "+numbers.empty());
		
	}

}
