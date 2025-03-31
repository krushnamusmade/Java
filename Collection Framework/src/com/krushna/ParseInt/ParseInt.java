package com.krushna.ParseInt;

public class ParseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "12345";
		int number = Integer.parseInt(str);
		System.out.println("Converted interger : "+number);

		try {
			String invalid = "123a";
			int invalidnumber = Integer.parseInt(invalid);
			System.out.println("Invalid number format : "+invalidnumber);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Invalid number format : "+e.getMessage());
		}
		
		String binarynumber = "1010";
		int num1 = Integer.parseInt(binarynumber,2);
		System.out.println("Binary to integer : "+num1);
	}

}
