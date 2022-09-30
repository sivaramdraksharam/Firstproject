package com.satyam.day3.beans;
//java bean
public class Customer {
	//private instance variables
	private int custId;
	private String custName;
	private String customerPhone;
	//no-arg constructor
	public Customer() {
		super();
	}
	public Customer(int custId, String custName, String customerPhone) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.customerPhone = customerPhone;
	}
	//generate getters and setters
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", customerPhone=" + customerPhone + "]";
	}
	
	
}
