package com.wilson.spring;

//public class Car extends Engine { //is a relationship
public class Car {

	public Car() {
		System.out.println("Deafult Car Constructor");
	}

	public void drive() {
		Engine e = new Engine();
		int start = e.start();
		
		if(start >= 1) {
			System.out.println("Car is started");
		}

	}

}
