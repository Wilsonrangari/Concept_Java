package com.wilson.inhertiance;

public class BasicWatch extends Watch {
	int date;
	int month;
	int year;
	
	BasicWatch(){
		System.out.println("Basic watch 0 constructor");
		
	}
	
	public void setDate(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
		
	}
	
	void displayDate() {
	System.out.println("The current date is "+date +"-"+month+"-"+year);
	}
	
}

