package com.wilson.stream8;

import java.util.function.Consumer;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee emp = () -> {
			System.out.println("Willy Boy lambda expression" );
		};

		emp.displayMessage();
		
		
		Consumer<String> con = str -> System.out.println("String value is "+str);
		
		con.accept("Welcome to Ashokit");
	}

}
