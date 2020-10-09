package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {
	
	private String firstName = "";
	private String middleName = "";
	private String lastName = "";
	private String ssn = "";
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	private CheckingAccount clientCheckingAccount = new CheckingAccount (0);
	private CheckingAccount[] amountCheckingAccounts;
	private SavingsAccount clientSavingsAccount = new SavingsAccount (0);
	private SavingsAccount[] amountSavingsAccounts;
	private int checkingAccountAmount = 0;
	private int savingsAccountAmount = 0;
	private int cdAccountsAmount = 0;
	private CDOffering cdOffering = new CDOffering(0,0);
	private CDAccount cdAccount = new CDAccount(cdOffering,0);
	private CDAcount[] amountCDAccounts;
	private int counterC = 0;
	private int counterS = 0;
	
	public AccountHolder() {
	}
	public AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn =ssn;
		this.cdOffering = new CDOffering(0,0);
		this.cdAccount = new CDAccount(this.cdOffering,0);
		
	}
	//* __________________________GETTERS_____________________________________________________
	
	Public String getFirstName () {
		
	}
	
	}