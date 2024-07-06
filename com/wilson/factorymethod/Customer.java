package com.wilson.factorymethod;

public class Customer implements Cloneable{
	
	private static Customer instance;
	
	private Customer() {
		
	}
	
	public static Customer getInstance() {
		if(instance == null) {
			instance = new Customer();
		}
		return instance;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
