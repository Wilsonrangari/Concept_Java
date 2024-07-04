package com.wilson.interfaces;

public class DisplayImp implements Display {

	@Override
	public void displayNumber(int number) {
		System.out.println("Number is "+number);

	}

	@Override
	public void displayArray(int[] arr) {
		System.out.println("Array is "+arr[0]);

	}

	@Override
	public void displayMessage(String message) {
		System.out.println("Message is "+message);
		
	}

}
