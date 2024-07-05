package com.wilson.SerailizationDeserialization;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int empId;
	public String empNmae;

	public Employee() {

	}

	public Employee(int empId, String empName) {
		this.empId=empId;
		this.empNmae=empName;

	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNmae=" + empNmae + "]";
	}
	
	

}
