package com.krushna.demo;

import java.util.Scanner;

public class AddofFirstLastNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Sum of first and last number ");
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int last = num%10;
		int first;
		while(num>9) {
			num = num/10;
		}
		int sum = last + num;
		System.out.println("Sum : "+sum);
	}

}
