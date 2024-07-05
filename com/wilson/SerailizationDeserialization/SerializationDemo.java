package com.wilson.SerailizationDeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("./employee.ser");
			 ObjectOutputStream oos = new ObjectOutputStream(fos);) {

			oos.writeObject(new Employee(1, "Wilson"));
			oos.writeObject(new Employee(2, "Ruchira"));
			oos.writeObject(new Employee(3, "Rohit"));

			oos.flush();
			System.out.println("Serialization is done ");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
