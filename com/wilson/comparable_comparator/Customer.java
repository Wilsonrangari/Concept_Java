package com.wilson.comparable_comparator;

public class Customer implements Comparable<Customer>{
	
	private int customerId;
	private String customerName;
	
	/*
	 * public Customer() { super(); // TODO Auto-generated constructor stub }
	 */
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	/*
	 * @Override public int compareTo(Customer cust) {
	 * 
	 * return this.customerName.compareTo(cust.getCustomerName()); }
	 */
	
	
	

}
