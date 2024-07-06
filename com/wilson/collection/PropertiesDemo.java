package com.wilson.collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		//prop.setProperty("Username", "Wilson");
		/*
		 * prop.setProperty("Password", "root"); prop.setProperty("Age", "29");
		 * prop.setProperty("Gender", "Male"); System.out.println(prop);
		 * System.out.println(prop.getProperty("Age"));
		 * System.out.println(prop.getProperty("Age"));
		 * System.out.println(prop.getOrDefault("Username", "Guest"));
		 */
		 
		prop.load(new FileInputStream("./com/wilson/collection/Database.properties"));
		String username = prop.getProperty("dbUsername");
		String password = prop.getProperty("dbPassword");
		System.out.println(username+" "+password);
		
		
	}

}
