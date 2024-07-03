package com.wilson.console;

import java.io.Console;

public class ConsoleClient {

	public static void main(String[] args) {
		
		Console con = System.console();
		
		/*
		 * System.out.println("Enter username"); String username = con.readLine();
		 * System.out.println("Enter password"); String password = con.readLine();
		 * System.out.println("Enter age"); String ageString = con.readLine(); int age =
		 * Integer.parseInt(ageString);
		 * 
		 * System.out.println("Username = "+username);
		 * System.out.println("Password = "+password);
		 * System.out.println("Username = "+age);
		 */
		
		System.out.println("Enter username");
		String username = con.readLine();
		System.out.println("Enter password");
		char[] passwordChar = con.readPassword();
		String password = new String(passwordChar);
		System.out.println("Enter age");
		String ageString = con.readLine();
		int age = Integer.parseInt(ageString);
		
		System.out.println("Username = "+username);
		System.out.println("Password = "+password);
		System.out.println("Username = "+age);

	}

}
