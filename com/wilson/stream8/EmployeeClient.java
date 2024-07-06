package com.wilson.stream8;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee emp = () -> {
			System.out.println("Willy Boy" );
		};

		emp.displayMessage();
	}

}
