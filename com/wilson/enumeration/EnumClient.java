package com.wilson.enumeration;

import java.util.Scanner;

public class EnumClient {

	public static void main(String[] args) {

		// Colors
		Color[] colorVal = Color.values();
		for (Color colorEnum : colorVal) {
			System.out.println(colorEnum);

		}
		System.out.println("++++++++++++++++++++++++++++++");

		// Days
		Days[] dayVal = Days.values();
		for (Days days : dayVal) {
			System.out.println(days);
		}
		System.out.println("+++++++++++++++++++++++++++++++++");

		EnumClient ec = new EnumClient();
		ec.testEnumWithSwitchCase(Color.YELLOW);

		System.out.println("++++++++++++++++++++++++++++++++++");

		Hotel[] getItems = Hotel.values();
		for (Hotel ht : getItems) {
			int menuIndex = ht.ordinal();
			System.out.println(menuIndex + "--------" + ht);
		}
		System.out.println("Please select the item from Menu");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		Hotel.getPrice(choice);
		

	}
	

	// Method
	public void testEnumWithSwitchCase(Color color) {

		switch (color) {
		case RED:
			System.out.println("Selected color is RED");
			break;

		case PINK:
			System.out.println("Selected color is PINK");
			break;

		case YELLOW:
			System.out.println("Selected color is YELLOW");
			break;

		case WHITE:
			System.out.println("Selected color is WHITE");
			break;

		case BLACK:
			System.out.println("Selected color is BLACK");
			break;

		default:
			System.out.println("Out of color");
			break;
		}
	}
}
