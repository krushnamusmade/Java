package com.krushna.HashSet.Sir;

import java.util.HashSet;
import java.util.Set;

public class CheackDuplicates {
	
	public static void main(String[] args) {
		
		Set<Account> allAccounts = new HashSet<Account>();
	
		allAccounts.add(new Account(1,"Krushna Musmade",500000,new Address("Lakh Road","Deolali Pravara")));
		allAccounts.add(new Account(2,"Kiran Musmade",700000,new Address("Lakh Road","Vashi")));
		System.out.println(allAccounts.size());

	}

}
