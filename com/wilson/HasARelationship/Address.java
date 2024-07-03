package com.wilson.HasARelationship;

public class Address {
	public int pinCode;
	public String name;
	
	public Address() {
		System.out.println("Default Address Constructor");
	}
	
	public void setAddress(int pinCode, String name) {
		this.pinCode = pinCode;
		this.name = name;
		
	}
	
	public void displayAddress() {
		System.out.println("Address is "+pinCode+" "+name);
	}

}
