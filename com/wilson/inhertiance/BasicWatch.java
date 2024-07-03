package com.wilson.inhertiance;

public class BasicWatch extends Watch {
	public int date;
	public int month;
	public int year;
	
	public BasicWatch(){
		System.out.println("Basic watch 0 constructor");
		
	}
	
	public void setDate(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
		
	}
	
	public void displayDate() {
	System.out.println("The current date is "+date +"-"+month+"-"+year);
	}
	
}

