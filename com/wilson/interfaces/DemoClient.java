package com.wilson.interfaces;

public class DemoClient {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30};
		
		DisplayImp obj = new DisplayImp();
		
		obj.displayNumber(10);
		obj.displayArray(arr);
		obj.displayMessage("Hello Interface");
		System.out.println(Display.PI);
		
		System.out.println("================================");
		
		Display d=new DisplayImp();
		d.displayNumber(10);
		d.displayArray(arr);
		d.displayMessage("Hello Interface");
		System.out.println(Display.PI);
		

	}

}
