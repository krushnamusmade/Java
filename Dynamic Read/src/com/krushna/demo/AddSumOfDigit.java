package com.krushna.demo;

import java.util.Scanner;

public class AddSumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----Sum of digit----");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a = sc.nextInt();
		int sum = 0;
		while(a>0) {
			int last = a%10;
		    sum = sum + last;
			a = a/10;
		}
		System.out.println("Sum : "+sum);

	}

}
