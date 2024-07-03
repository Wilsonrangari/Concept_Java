package com.wilson.inhertiance;

public class Watch {
	protected int hour;
	protected int minute;
	protected int second;
	
	protected Watch(){
		System.out.println("Watch 0 constructor");
		
	}
	
	protected void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	protected void displayTime() {
	System.out.println("The current time is "+hour+"."+minute+"."+second);
	}
	
	

}
