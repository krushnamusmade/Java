package com.krushna.HashSet.Sir;

public class Account {
	
	int actId;
	String actName;
	private float balance;
	transient Address postal;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int actId, String actName, float balance, Address postal) {
		super();
		this.actId = actId;
		this.actName = actName;
		this.balance = balance;
		this.postal = postal;
	}

	public int getActId() {
		return actId;
	}

	public String getActName() {
		return actName;
	}

	public float getBalance() {
		return balance;
	}

	public Address getPostal() {
		return postal;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public void setPostal(Address postal) {
		this.postal = postal;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.hashCode(this.actId);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		Account otherObj = (Account)obj;
		if(this.actId == otherObj.actId) {
			return true;
		}
		else {
			return false;
		}
		
	}

	
}
