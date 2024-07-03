package com.wilson.inhertiance;

public class Watch {
	public int hour;
	public int minute;
	public int second;
	
	public Watch(){
		System.out.println("Watch 0 constructor");
		
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	public void displayTime() {
	System.out.println("The current time is "+hour+"."+minute+"."+second);
	}
	
	

}
