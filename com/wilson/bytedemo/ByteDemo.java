package com.wilson.bytedemo;

public class ByteDemo {

	public static void main(String[] args) {

		byte[] a = { 65, 66, 67 };
		for (byte b : a) {
			System.out.print(b+",");
		}

		String str = new String(a);
		System.out.println(str);

	}

}

//Ctrl+t