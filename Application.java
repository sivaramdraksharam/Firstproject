package com.satyam.day8.Banking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

import com.satyam.day3.beans.Customer;
import com.satyam.day3.beans.Manager;

public class Application {
	
	private int applicationId;
	private String applicationPurpose;
	private LocalDate applicationDate;
	private Customer customer;
	private Account accountType;
	private boolean autoGenerateId;
	public Application() {
		super();
	}
	public Application(int applicationId, String applicationPurpose, LocalDate applicationDate,Account accountType) {
		super();
		this.applicationId = applicationId;
		this.autoGenerateId= autoGenerateId; 
		if(autoGenerateId==true)
		{
						applicationId=1;
		}
		this.applicationPurpose = applicationPurpose;
		this.applicationDate = applicationDate;
	}
	
	public boolean fillApplication(Customer customer) throws NumberFormatException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		this.customer=customer;
		System.out.println("Enter Application Id:");
		this.applicationId=Integer.parseInt(br.readLine());
		
		System.out.println("Enter purpose of application");
		this.applicationPurpose=br.readLine();
		
		System.out.println("Enter application Date(dd-mm-yyyy)");
		String appDate=br.readLine();
		String applDate[]=appDate.split("-");
		this.applicationDate=LocalDate.of(Integer.parseInt(applDate[2]),Integer.parseInt(applDate[1]),Integer.parseInt(applDate[3]));
		
		
		return true;
	}
	public boolean verifyApplication(Manager verfier)
	{
		customer=this.customer;
		if(customer.getCustomerPhone()!=null)
			System.out.println("Verification completed");
		else
		{
			System.out.println("Phone number not filled!");
			return false;
		}
		
		return true;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getApplicationPurpose() {
		return applicationPurpose;
	}
	public void setApplicationPurpose(String applicationPurpose) {
		this.applicationPurpose = applicationPurpose;
	}
	public LocalDate getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public boolean isAutoGenerateId() {
		return autoGenerateId;
	}
	public void setAutoGenerateId(boolean autoGenerateId) {
		this.autoGenerateId = autoGenerateId;
	}
	public Account getAccountType() {
		return accountType;
	}
	public void setAccountType(Account accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", applicationPurpose=" + applicationPurpose
				+ ", applicationDate=" + applicationDate + ", customer=" + customer + ", accountType=" + accountType
				+ ", autoGenerateId=" + autoGenerateId + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
