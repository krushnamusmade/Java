package com.krushna.demo;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] arg) {
		
		System.out.println("Prime Number bet two number");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower number : ");
		int low = sc.nextInt();
		System.out.print("Enter upper number : ");
		int upp = sc.nextInt();
		
		System.out.print("Prime Number are ");
		for(int i = low ; i<=upp ; i++) {
			if(isPrime(i)){
				System.out.print(" " + i);
			}
		}
	}

	public static  boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num <=1) {
			return false;
		}
		for(int i = 2; i<=Math.sqrt(num) ; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
		
	}

}
