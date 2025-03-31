package com.krushna.array;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of array : ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		for(int i=0;i<array.length;i++) {
			
			System.out.print("Enter element in array : ");
			array[i] = sc.nextInt();
		}
		
		System.out.print("Element in Array : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		System.out.print("For each : ");
		for(int num : array) {
			System.out.print(num+" ");
		}
	}

}
