package com.satyam.day8.Banking;

public interface Account {
	
	public abstract void withdraw();
	public abstract void deposit();
	//concrete method
	public static void showBankAccount(Bank b)
	{
		System.out.println(b.getBankName());
		System.out.println(b.getBranchName());
		System.out.println(b.getIfscCode());
		System.out.println(b.getCity());
	
	}
	
	
}
