package com.wilson.factorymethod;

public class Employee{

	// Early Instansiation
	private static final Employee emp = new Employee();

	private Employee() {
	}

	public static Employee getInstance() {
		return emp;

	}

}
