package com.wilson.spring;

public class TestDemo {

	public static void main(String[] args) {
		
		//Car c = new Car(new PetrolEngine());
		//Car c = new Car(new DiselEngine());
		Car c = new Car();
		//c.setEngine(new PetrolEngine());
		c.eng = new DiselEngine();
		c.drive();
		

	}

}
