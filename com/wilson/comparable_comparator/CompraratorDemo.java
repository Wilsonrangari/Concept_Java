package com.wilson.comparable_comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
		
				/*
				 * Collections.sort(nameList); System.out.println(nameList);
				 */
		
//				Collections.sort(nameList, (cust1, cust2) -> cust1.getCustomerId() - cust2.getCustomerId());
//				System.out.println("Sorting base on customer id "+nameList);
		
//				Collections.sort(nameList, (cust1, cust2) -> cust1.getCustomerName().compareTo(cust2.getCustomerName()));
//				System.out.println("Sorting based on customer name "+nameList);
				
//				Collections.sort(nameList, (cust1, cust2) -> -cust1.getCustomerName().compareTo(cust2.getCustomerName()));
//				System.out.println("Sorting based on customer name using minus sign descending "+nameList);
				
				//Java8 style usingmethod reference
				
				Comparator<Customer> comparing = Comparator.comparing(Customer::getCustomerName);
				
		

	}

}
