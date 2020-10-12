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
	private static long nextAccountNumber = 00000001;
	
	static void addAccountHolder(AccountHolder accountHolder)
	{
		accountHolder = new AccountHolder()
		
	}
	
	static AccountHolder[] getAccountHolders()
	{
		
	}
	
	static CDOffering[] getCDOfferings()
	{

	}
	
	static CDOffering getBestCDOffering(double depositAmount)
	{
		
	}
	
	static CDOffering getSecondBestCDOffering(double depositAmount)
	{
		
	}
	
	static void clearCDOffering()
	{
		
	}
	
	static void setCDOfferings(CDOffering[] offerings)
	{
		
	}
	
	static long getNextAccountNumber()
	{
		long acctNum = nextAccountNumber;
		nextAccountNumber++;
		return acctNum;
	}
	
	static double totalBalances()
	{
		
	}
	
	static double futureValue(double presentValue, double interestRate int term)
	{
		
	}
	
}