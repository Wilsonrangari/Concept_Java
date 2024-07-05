package com.wilson.SerailizationDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("./employee.ser");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj1 = ois.readObject();
			Object obj2 = ois.readObject();
			Object obj3 = ois.readObject();
			
			
			Employee emp1 = (Employee)obj1;
			Employee emp2 = (Employee)obj2;
			Employee emp3 = (Employee)obj3;
			System.out.println("Deserialized Object is:");
			System.out.println(emp1);
			System.out.println(emp2);
			System.out.println(emp3);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
