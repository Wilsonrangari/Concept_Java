package com.wilson.stream;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee emp = () -> {
			System.out.println("Willy Boy" );
		};

		emp.displayMessage();
	}

}
