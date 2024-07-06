package com.wilson.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> nameList = new HashSet();
		nameList.add("Wilson");
		nameList.add("Pooja");
		nameList.add("Ashok");
		nameList.add("Wilson");
		nameList.add("Rahul");
		nameList.add("Ram");
		nameList.add("Arusha");
		nameList.add("Bunty");

		System.out.println("nameList size is " + nameList.size());
		System.out.println("nameList is " + nameList);

		Set<String> customerList = new HashSet();
		customerList.add("Pooja");
		customerList.add("Wilson");
		customerList.add("Mahesh");
		customerList.add("Ramesh");
		customerList.add("Lakhan");
		customerList.add("Champu");
		customerList.add("Rani");
		customerList.add("Raj");
		System.out.println("customerList size is " + customerList.size());
		System.out.println("customerList is " + customerList);

		boolean all = nameList.addAll(customerList);
		if (all) {
			System.out.println("All added value is " + nameList);
			System.out.println("Size of all data is " + nameList.size());
		}

		Set<String> add = new HashSet();
		boolean retainAll = nameList.retainAll(customerList);
		if (retainAll) {
			System.out.println("All intersection value is " + nameList);
			System.out.println("Size of intersection is " + nameList.size());
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		//Lambda way
		nameList.stream().forEach( str -> System.out.println("Lambda exp "+str));
		
		System.out.println("++++++++++++++++++++++++++");
		//Another Way
		
		Iterator<String> iterator = nameList.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
	}

}
