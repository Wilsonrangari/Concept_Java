package com.wilson.inhertiance;

public class BasicWatch extends Watch {
	protected int date;
	protected int month;
	protected int year;
	
	protected BasicWatch(){
		System.out.println("Basic watch 0 constructor");
		
	}
	
	protected void setDate(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
		
	}
	
	protected void displayDate() {
	System.out.println("The current date is "+date +"-"+month+"-"+year);
	}
	
}

