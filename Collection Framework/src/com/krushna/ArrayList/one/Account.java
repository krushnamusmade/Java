package com.krushna.ArrayList.one;

public class Account {

	int actId;
	String actName;
	private float balace;
	transient Address postal;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int actId, String actName, float balace, Address postal) {
		super();
		this.actId = actId;
		this.actName = actName;
		this.balace = balace;
		this.postal = postal;
	}

	public int getActId() {
		return actId;
	}

	public String getActName() {
		return actName;
	}

	public float getBalace() {
		return balace;
	}

	public Address getPostal() {
		return postal;
	}

	public void setActId(int actId) {
		System.out.println("Set Method call : "+actId);
		this.actId = actId;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public void setBalace(float balace) {
		this.balace = balace;
	}

	public void setPostal(Address postal) {
		this.postal = postal;
	}
	
	
}
