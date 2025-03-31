package com.krushna.array;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[5];
		System.out.print("Before inserting value : ");
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		a[0] = 1;
		a[1] = 2;
		a[2] = 83;
		a[4] = 22;
		System.out.println();
		System.out.print("After inserting value : ");
		for(int i =0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
		String str = "Krushns";
		System.out.println("Length of String : "+str.length());
		
	}

}
