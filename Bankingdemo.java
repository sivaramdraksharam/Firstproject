package com.satyam.day8.Banking;

import java.io.IOException;

import com.satyam.day3.beans.Customer;

public class Bankingdemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Bank canaraBank=new Bank();
		canaraBank.setBankName("Canara Bank");
		canaraBank.setBranchName("Koramangala");
		canaraBank.setIfscCode("CAN0000236");
		canaraBank.setCity("Bangalore");

		Bank unionBank=new Bank();
		unionBank.setBankName("Union Bank");
		unionBank.setBranchName("Marhalli");
		unionBank.setIfscCode("UB000123");
		unionBank.setCity("Mumbai");
		
		
		Customer c=new Customer();
			
		Bank.openAccount(c,canaraBank);
		Bank.openAccount(c,unionBank);
		

	}

}
