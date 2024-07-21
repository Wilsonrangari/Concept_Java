package com.wilson.thread;

public class Main {

	public static void main(String[] args) {
		
		
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();

	}

}
