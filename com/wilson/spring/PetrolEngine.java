package com.wilson.spring;

public class PetrolEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("Petrol Engine Started");
		return 1;
	}

}
