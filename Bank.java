package com.satyam.day8.Banking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalTime;	
import java.util.LinkedList;
import java.util.List;

import com.satyam.day3.beans.Customer;
import com.satyam.day3.beans.Manager;
//java bean- all instance variables are private, should have no-arg constructor and getters,setters
public class Bank implements Privatebank {
	private String bankName;
	private String branchName;
	private String ifscCode;
	private String city;
	private static List<Account> accounts;

	public Bank() {
		super();
	}

	public Bank(String bankName, String branchName, String ifscCode, String city) {
		super();
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.city = city;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static Account getAccount(String accountType) {
		if (accountType.equalsIgnoreCase("Savings Account")) {
			return new Savingsaccount();
		} else if (accountType.equalsIgnoreCase("Fixed deposit account")) {
			return new Fixeddepositaccount();
		} else
			return null;
	}

	public static boolean openAccount(Customer c, Bank b) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Application application = new Application();
		// call setter methods
		application.setApplicationId(1);
		application.setApplicationPurpose("Openning new Bank account");

		System.out.println("Enter customer ID:");
		c.setCustId(Integer.parseInt(br.readLine()));
		System.out.println("Enter customer Name:");
		c.setCustName(br.readLine());
		System.out.println(
				"Enter the type of account to open:\n1.Savings Account\n2.Fixed deposit account\n3.Current account\n4.Exit");
		String accountType = br.readLine();

		System.out.println("Enter phone number:");
		c.setCustomerPhone(br.readLine());

		application.setCustomer(c);

		Account account = null;

		switch (accountType) {
		case "Savings Account":
			account = new Savingsaccount();
			//getAccount("Savings Account");
			break;
		case "Fixed deposit account":
			account = getAccount("Fixed deposit account");
			break;
		case "Current Account":
			account = getAccount("Current Account");
			break;
		default:
			System.out.println("Invalid account type!!!");
		}
		if (account instanceof Savingsaccount) {
			Savingsaccount sa = (Savingsaccount) account;
			sa.setOpenningDate(LocalDate.now());
			sa.setOpenningTime(LocalTime.now());
			sa.setMinimumBalance(500);

		} else if (account instanceof Fixeddepositaccount) {
			Fixeddepositaccount fda = (Fixeddepositaccount) account;
			fda.setOpenningDate(LocalDate.now());
			fda.setOpenningTime(LocalTime.now());
			fda.setMinimumBalance(5000);
		}

		if (account != null)
			application.setAccountType(account);

		System.out.println("It takes a couple of days to open Account...thank you");
		
		Manager m = new Manager();
		accounts = new LinkedList<Account>();
		if (application.verifyApplication(m)) {

			// Account.showBankAccount(b);

			// lambda expression and creating functional interface reference
			Privatebank pb = (x) -> Account.showBankAccount(x);
			// calling abstract method to execute above lambda using functional interface
			// reference
			pb.showPrivateBank(b);

			accounts.add(application.getAccountType());

		} else {
			System.out.println("Application contains blanks....! re fill application!");
		}

		System.out.println("Application details:" + application);

		return true;
	}

	@Override
	public void showPrivateBank(Bank b) {
	System.out.println(b);
		
	}

}
