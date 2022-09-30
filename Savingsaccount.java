package com.satyam.day8.Banking;

public class Savingsaccount extends Accountstatistics implements Account{
	private Long accountNumber;
	private String accountHolderName;
	private float accountBalance;
	
	public Savingsaccount() {
		super();
		
	}
	
	public Savingsaccount(Long accountNumber, String accountHolderName, float accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}
	

}
