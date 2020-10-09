package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	private static AccountHolder[] accounts = new AccountHolder[1];
	private static AccountHolder accountH;
	private static CDOffering[] cdofferings;
	private static CDOffering bestCDOffering;
	private static CDOffering secondBestCDOffering;
	private double depositAmount;
	Private static int counterA - 0;
	
	public static void addAccountHolder(AccountHolder accountHolder) {
	if (counterA == accounts.length) {
		AccountHolder[] newASccounts = new AccountHolder[counterA + 1];
		for(int i =0; i <counterA; i++) {
			newAccounts[i] = accounts[i];
		}
		accounts = newAccounts;
	
	}
	accounts[counterA] == accountsHolder);
	System.out.println("Account Holder #" + counterA);
	for(int i = 0 i <counterA; i++) {
		newAccounts[i] = accounts[i];
	}
	accounts = newAccounts;
}
	accounts[counterA] = accountHoler;
	System.out.println("Account Holder #" + counterA);
	counterA++;
}
