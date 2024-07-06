package com.wilson.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		
		SortedSet<String> nameList = new TreeSet();
		nameList.add("Wilson");
		nameList.add("Pooja");
		nameList.add("Ashok");
		nameList.add("Wilson");
		nameList.add("Rahul");
		nameList.add("Ram");
		nameList.add("Arusha");
		nameList.add("Bunty");
		System.out.println(nameList);
		
		System.out.println(nameList.first());
		System.out.println(nameList.last());
		System.out.println(nameList.tailSet("Rahul"));

	}

}
