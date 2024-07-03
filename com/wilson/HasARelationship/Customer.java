package com.wilson.HasARelationship;

public class Customer {
	
	public int customerId;
	public String customerName;
	
	Address add = new Address();
	
	public Customer() {
		System.out.println("Defult Customer Custructor");
	}
	
	public void setCustomerData(int customerId, String customerName ) {
		this.customerId=customerId;
		this.customerName=customerName;
		
	}
	public void displayCustomerData() {
		System.out.println("Customer Data is "+customerId+"-"+customerName);
		
		
	}
	
	

}
