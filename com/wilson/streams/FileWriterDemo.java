package com.wilson.streams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")){
			
			String message = "Hi Wilson I am playing with FileWriter class";
			
			fw.write(message);
			fw.flush();
			System.out.println("Data has been written, Check the writer.txt file you will see data");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
