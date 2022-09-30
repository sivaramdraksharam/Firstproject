package com.satyam.day3.beans;

import com.satyam.day3.beans.Employee;

public class Clerk extends Employee
{
	private float providentFund;
	//no-arg constructor
	public Clerk(){};

	//parameterized constructor
	public Clerk(float providentFund) {
		super();
		this.providentFund = providentFund;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}
	
	
}