package com.wilson.stream8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Consumer;

public class ConsumerFIDemo {

	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Wilson", "Ashok", "Rahul", "Megha", "Ram");

		Stream<String> streamObj = nameList.stream();
		
		//1.first version
//		Consumer<String> con = (str) -> System.out.print("First version :"+str+" ");
//		streamObj.forEach(con);
		System.out.println("===================================================");
		
		//2. Secound Version
		
		streamObj.forEach(str -> System.out.println("Secound version: "+str));

	}

}
