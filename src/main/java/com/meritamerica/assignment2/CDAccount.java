package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount extends BankAccount {
	private double balance;
	private int term;
	private long accountNumber;
	private Date date;
	private double futureValue;
	private CDOffering offering;
	
	CDAccount(DCOffering  offering, double balance) {
		super(balance, offering.getInterestRate());
		this.offering = offering;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return offering.getInterestRate();
	}
	public int getTerm() {
		return this.term;
	}
	public Date getStartDate() {

}
