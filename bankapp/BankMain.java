package com.green.bankapp;

class BankMain
{
	public Bank BankType(Bank p)
	{
		
		String name=p.bankName();
		double rate=p.bankInterest();	
		
		System.out.print(name+"  "+rate);
		
		return p;
	}
	
}
