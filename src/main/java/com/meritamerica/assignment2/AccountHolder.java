package com.meritamerica.assignment2;

import java.util.Arrays;
import java.text.DecimalFormat;

public class AccountHolder {
	
	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String ssn = "";
	
	CheckingAccount checkingaccount;
	SavingsAccount savingaccount;
	
	
	//The parameters for the account holder
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) 
	{
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		
	}
	
	
	//getters and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	
	public String getLastname() {
		return lastName;
	}
	public void setLastName(String lName) {
		this.lastName = lName;
	}
	
	
	public String getSSN() {
		return ssn;
	}
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	CheckingAccount addCheckingAccount(double openingBalance) 
	{
		return;
	}
	CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		return;
	}
	CheckingAccount[] getCheckingAccounts() {
		return checkingAccount;
	}
	public int getNumberOfCheckingAccounts()
	{
		
	}
	public double getCheckingBalance()
	{
		
	}
	SavingsAccount addSavingsAccount(double openingBalance)
	{
	return;	
	}
	SavingsAccount addSavingsAccount(SavingsAccount savingsAccount)
	{
	return;	
	}
	SavingsAccount[] getSavingsAccount() {
	}
		return savingaccount;
	}
	public int getNumberOfSavingsAccounts()
	{
		
	}
	public double getSavingsBalance()
	{
		
	}
	CDAccount addCDAccount (CDOffering offering, double openingBalance)
	{
		
	}
	
	CDAccount addCDAccount(CDAccount cdAccount)
	{
		
	}
	CDAccount[] getCDAccounts() 
	{
		
	}
	public int getNumberOfCDAccounts()
	{
		
	}
	public double getCDBalance()
	{
		
	}
	
	public double getCombinedBalance()
	{

	}
	
	
		
	
	public String toString() {
		DecimalFormat decf = new DecimalFormat("0.##");
		
		return "Acount holders name: " + firstName + " " + middleName + " " + lastName + "\n"
				+ "Social Security number: " + ssn + "\n"
				+ "The checking account balance: " + decf.format(checkingaccount.getTheBalance()) + "\n"
				+ "The saving account balance:" + decf.format(savingaccount.getTheBalance()) + "\n"
				+ "Checking Account balance in 3 years: " + decf.format(checkingaccount.interestVal(3)) + "\n"
				+ "Savings Account balance in 3 n years: " + decf.format(savingaccount.interestVal(3)) + "\n"
				+ "The Checking Account with an interest rate of: " + checkingaccount.getIntRate() + "\n"
				+ "The Savings Account with an interest rate of: " + savingaccount.getIntRate();
		
	}
}
