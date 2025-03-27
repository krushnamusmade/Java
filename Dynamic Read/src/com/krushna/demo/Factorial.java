package com.krushna.demo;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factorial of given number ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = 1 ;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of given number : "+fact);

	}

}
