package com.wilson.spring;

//public class Car extends Engine { //is a relationship
public class Car {

	public IEngine eng;

	/*
	 * public Car(IEngine eng) { System.out.println("Deafult Car Constructor");
	 * this.eng = eng; }
	 */
	public void setEngine(IEngine eng) {
		this.eng = eng;
	}
	

	public void drive() {
		int start = eng.start();

		if (start >= 1) {
			System.out.println("Journey Started");
		}

	}

}
