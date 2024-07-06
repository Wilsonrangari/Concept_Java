package com.wilson.factorymethod;

public class LazyAndEarlyInstanClient {
	

	public static void main(String[] args) {
		
		//Following singletone pattern
	
		Employee emp1 = Employee.getInstance();
		Employee emp2 = Employee.getInstance();
		Employee emp3 = Employee.getInstance();
		
		System.out.println("Obj1 hascode is "+emp1.hashCode());
		System.out.println("Obj2 hascode is "+emp2.hashCode());
		System.out.println("Obj3 hascode is "+emp3.hashCode());

	}

}
