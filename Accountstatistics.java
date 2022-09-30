package com.satyam.day8.Banking;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Accountstatistics implements Account{
	
	private LocalDate openningDate;
	private LocalTime openningTime;
	private LocalDate closingDate;
	private LocalTime closingTime;
	private int minimumBalance;
	
	public int getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(int minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	//Account opening details
	Accountstatistics()
	{
		
	}
	public Accountstatistics(LocalDate openningDate, LocalTime openningTime, LocalDate closingDate,LocalTime closingTime) {
		super();
		this.openningDate = openningDate;
		this.openningTime = openningTime;
		this.closingDate = closingDate;
		this.closingTime = closingTime;
	}
	public LocalDate getOpenningDate() {
		return openningDate;
	}
	public void setOpenningDate(LocalDate openningDate) {
		this.openningDate = openningDate;
	}
	public LocalTime getOpenningTime() {
		return openningTime;
	}
	public void setOpenningTime(LocalTime openningTime) {
		this.openningTime = openningTime;
	}
	public LocalDate getClosingDate() {
		return closingDate;
	}
	public void setClosingDate(LocalDate closingDate) {
		this.closingDate = closingDate;
	}
	public LocalTime getClosingTime() {
		return closingTime;
	}
	public void setClosingTime(LocalTime closingTime) {
		this.closingTime = closingTime;
	}
	
	
}
