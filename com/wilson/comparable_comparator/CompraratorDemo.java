package com.wilson.comparable_comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompraratorDemo {

	public static void main(String[] args) {
		
		List<Customer> nameList = Arrays.asList(
				new Customer(1, "Wilson"),
				new Customer(45, "Rahul"),
				new Customer(78, "Ram"),
				new Customer(100, "Kan"),
				new Customer(7, "Ban"),
				new Customer(8, "Alesha"),
				new Customer(89, "Rekha")
				);
		
		Collections.sort(nameList);
		System.out.println(nameList);
		

	}

}
