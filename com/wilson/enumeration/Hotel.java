package com.wilson.enumeration;

public enum Hotel {

	IDLY(25), DOSA(50), VADA(60), MASALADOSA(70);

	private int price;

	Hotel(int price) {
		this.price = price;

	}

	static void getPrice(int userOption) {
		Hotel[] allItems = Hotel.values();
		System.out.println("You need to pay for the following ITEM ::::" + allItems[userOption].price);
		
		//VIMP
		System.out.println(Hotel.VADA.price);
		System.out.println("Happy Food");
	}

}
