package com.wilson.streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		
		try (FileReader fr = new FileReader("text.txt");){
			
			int positionByte = fr.read();
			
			while (positionByte != -1) {
				
				char ch = (char)positionByte;
				System.out.print(ch);
				positionByte = fr.read();
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
