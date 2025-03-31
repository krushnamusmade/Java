package com.krushna.array;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {1,2,3,4,5,6,7,8};
		System.out.println("Accesing using for each loop");
		
		for(int num:array) {
			System.out.println(num);
		}

		System.out.println("Assceing using for loop");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
