package com.wilson.inhertiance;

public class Watch {
	int hour;
	int minute;
	int second;
	
	Watch(){
		System.out.println("Watch 0 constructor");
		
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	void displayTime() {
	System.out.println("The current time is "+hour+"."+minute+"."+second);
	}
	
	

}
