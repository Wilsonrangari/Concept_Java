package com.wilson.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("text.txt");){
			
			/*
			 * int positionByte = fis.read();
			 * 
			 * while(positionByte!=-1) { char ch =(char)positionByte; System.out.print(ch);
			 * //positionByte--; positionByte= fis.read(); //reads next byte of info
			 * 
			 * }
			 */
			byte[] allBytes = fis.readAllBytes();
			String newString = new String(allBytes);
			System.out.println(newString);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
