package com.wilson.factorymethod;

public class LazyAndEarlyInstanClient {
	

	public static void main(String[] args) {
		
		//Following singletone pattern
		//System.out.println("Early Instansiation");
		Employee emp1 = Employee.getInstance();
		Employee emp2 = Employee.getInstance();
		Employee emp3 = Employee.getInstance();
//		
//		System.out.println("Obj1 hascode is "+emp1.hashCode());
//		System.out.println("Obj2 hascode is "+emp2.hashCode());
//		System.out.println("Obj3 hascode is "+emp3.hashCode());
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println("Lazy Instansiation");
		Customer c1 = Customer.getInstance();
		Customer c2 = Customer.getInstance();
		Customer c3 = Customer.getInstance();
		System.out.println("c1 hascode is "+c1.hashCode());
		System.out.println("c2 hascode is "+c2.hashCode());
		System.out.println("c3 hascode is "+c3.hashCode());

	}

}
