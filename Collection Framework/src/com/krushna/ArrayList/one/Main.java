package com.krushna.ArrayList.one;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		System.out.println(names.size());
		names.add("Krushna");
		names.add("Kiran");
		names.add("Kunal");
		System.out.println(names.size());
		names.remove(2);
		System.out.println(names.get(1));
		
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
			Object ref = names.get(i);
			if(ref instanceof Account) {
				Account act = (Account) ref;
				act.getBalace();
			}
		}

	}

}
