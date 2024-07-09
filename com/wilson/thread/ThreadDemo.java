package com.wilson.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Thread Concept");
		
		Thread currThread = Thread.currentThread();
		
		System.out.println(currThread.getClass());
		System.out.println(currThread.getId());
		System.out.println(currThread.getName());
		System.out.println(currThread.getPriority());
		currThread.setName("Wilson");
		currThread.setPriority(Thread.MAX_PRIORITY);
		
		
		System.out.println("Current Thread name is "+currThread);
		
		System.out.println("Thread ended");
		

	}

}
