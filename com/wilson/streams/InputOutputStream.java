package com.wilson.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStream {

	public static void main(String[] args)  {
		
	try {
		FileOutputStream fos = new FileOutputStream("text.txt");
		
		String message = "Hi Wilson, I am learning about input output stream in Java";
		
		fos.write(message.getBytes());
		
		System.out.println("Data has been written in text.txt file");
		
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
