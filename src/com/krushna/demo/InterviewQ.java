package com.krushna.demo;

import java.util.Scanner;

public class InterviewQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//Swap Two Number
//		int num1 = 5;
//		int num2 = 10;
//		 num1 = num1+num2;
//		 num2 = num1-num2;
//		 num1 = num1-num2;
//		 System.out.println("num1 : "+num1);
//		 System.out.println("num2 : "+num2);
		 
		 //Palindrome Number 
//		Scanner sc = new Scanner(System.in);
//		int num;
//		 System.out.println("Enter number : ");
//		 num = sc.nextInt();
//		 int output = num;
//		 int rem,res=0;
//		 while(num>0) {
//			  rem = num%10;
//			  res = res*10 + rem;
//			  num = num/10;
//			 
//		 }
//		 if(output == res) {
//			 System.out.println("Given number is palindrome");
//		 }else {
//			 System.out.println("Not palindrome");
//		 }
		
//		//ArmStrong Numebr
//		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.println("Enter Number : ");
//		num = sc.nextInt();
//		int rem,res=0;
//		int out = num;
//		while(num>0) {
//			rem = num%10;
//			res = (rem*rem*rem) + res;
//			num = num/10;
//		}
//		if(out == res) {
//			System.out.println("Number is armstrong");
//		}else {
//			System.out.println("Not armstrong");
//		}
		
//		//Strong number
//		Scanner sc = new Scanner(System.in);
//		int num;
//		int fact,sum=0;
//		System.out.println("Enter number : ");
//		num = sc.nextInt();
//		int out = num;
//		for(int j=out; j>0; j=j/10) {
//			fact = 1;
//			for(int i=1; i<= j%10; i++) {
//				fact = fact*i;
//			}
//			sum = sum + fact;
//		}
//		if(out == sum) {
//			System.out.println("Strong number");
//		}else {
//			System.out.println("Not strong numebr");
//		}
		
//		//Perfect Number
//		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.println("Enter number :");
//		num = sc.nextInt();
//		int out = num;
//		int sum=0;
//		for(int i=1; i<=num/2;i++) {
//			if(num%i == 0) {
//				sum = sum + i;
//			}
//		}
//		if(sum == out) {
//			System.out.println("perfect number");
//		}else {
//			System.out.println("Not perfect numebr");
//		}
		
		//Higher number in array
//		int[] arr = {10,25,87,1,25};
//		int max;
//		max = arr[0];
//		for(int i=0; i<arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println("Higher number in array : "+max);
		
//		Scanner sc = new Scanner(System.in);
//		int size;
//		System.out.println("Enter size of array : ");
//		size = sc.nextInt();
//		int[] arr = new int[size];
//		System.out.println("Enter value in arry : ");
//		for(int i=0; i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//		}
//		int max = 0;
//		for(int i=0; i<arr.length; i++) {
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//		}
//		System.out.println("Higher number in array : "+max);
//		
		//First and second highest number in array
//		int[] arr = {10,20,30,40,50};
//		int highest=0;
//		int secondHighest=0;
//		
//		for(int num : arr) {
//			if(num > highest) {
//				secondHighest = highest;
//				highest = num;
//			}
//		}
//		System.out.println(highest);
//		System.out.println(secondHighest);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Size of array : ");
//		int size = sc.nextInt();
//		int[] arr = new int[size];
//		for(int i =0 ;i <size;i++) {
//			System.out.print("Enter element in array : ");
//			arr[i] = sc.nextInt();
//		}
//		int highest = 0;
//		int secondHighest = 0;
//		for(int i=0 ; i< arr.length; i++) {
//			if(highest < arr[i]) {
//				secondHighest = highest;
//				highest = arr[i];
//			}
//			else if(arr[i] > secondHighest && arr[i] != highest){
//				secondHighest = arr[i];
//			}
//				
//			
//		}
//		System.out.println("First Highest : "+highest);
//		System.out.println("Second Highest : "+secondHighest);
		
		//store character frequencies
//		String str = "aaabbccwwedsqaa";
//		int[] freq = new int[26];
//		
//		for(int i =0;i<str.length();i++) {
//			char ch = str.charAt(i);
//			freq[ch-'a']++;
//		}
//		System.out.println("Character Frequencies");
//		for(int i=0;i<freq.length;i++) {
//			if(freq[i] > 0) {
//				System.out.println((char) (i + 'a') + " : "+freq[i]);
//			}
//		}
		
//		int[] arr = {1,2,4,5,6};
//		int num = arr.length;
//		
//		int expectedSum = num *(num+1)/2;
//		int actualSum = 0;
//		for(int number :arr) {
//			actualSum +=number;
//		}
//		int missingNumber = actualSum - expectedSum;
//		
//		System.out.println("Missing Number in array : "+missingNumber);
		
		
//		Scanner sc = new Scanner(System.in);
//        int num;
//        System.out.println("Enter Number : ");
//        num = sc.nextInt();
//		if(num > 0) {
//			System.out.println("Number is positive");
//		}
//		else if (num == 0) {
//			System.out.println("Non positive Non Ngative");
//		}
//		else {
//			System.out.println("Number is negative");
//		}
		
		 Scanner sc  = new Scanner(System.in);
	        System.out.println("Enter Number : ");
	        int num = sc.nextInt();
	        
	        if(num % 2 == 0){
	             System.out.println("Number is even" );
	        }else{
	             System.out.println("Number is odd");
	        }
		
	}

}
