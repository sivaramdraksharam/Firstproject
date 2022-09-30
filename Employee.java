package com.satyam.day3.beans;

import java.io.Serializable;

public class Employee  implements Serializable{

	private int employeeId;
	//mutable object reference
	private StringBuilder employeeName;
	private float employeeSalary;
	
	//no-arg constructor
	public Employee() {
		System.out.println("Employee no-arg constructor");
	}
	//parameterized constructor
	public Employee(int employeeId, StringBuilder employeeName, float employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public StringBuilder getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(StringBuilder employeeName) {
		this.employeeName = employeeName;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	

}
