package com.luv2code.jsp.tagdemo;

public class Student {

	private String firstname;
	private String lastname;
	private boolean goldCustomer;
	
	public Student(String firstname, String lastname, boolean goldCustomer) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.goldCustomer = goldCustomer;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean isGoldCustomer() {
		return goldCustomer;
	}

	public void setGoldCustomer(boolean goldCustomer) {
		this.goldCustomer = goldCustomer;
	}
	
	
	
}
