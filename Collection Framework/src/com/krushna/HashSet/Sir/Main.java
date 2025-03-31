package com.krushna.HashSet.Sir;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> names = new HashSet<String>();
		names.add("Chetan");
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Virat");
		names.add("Suresh");
		System.out.println(names.size());
		
		System.out.println(names);
		
//		for(String ref:names) {
//			if(ref.equals("Ramesh")) {
//				names.remove(ref);
//				System.out.println(ref);
//			}
//		}
		
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			String ref = iter.next();
			if(ref.equals("Ramesh")) {
				iter.remove();
			}
			System.out.println(ref);
		}
		System.out.println(names);
	}

}
