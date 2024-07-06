package com.wilson.factorymethod;

public class Customer {
	
	private static Customer instance;
	
	private Customer() {
		
	}
	
	public static Customer getInstance() {
		if(instance == null) {
			instance = new Customer();
		}
		return instance;
		
	}

}
