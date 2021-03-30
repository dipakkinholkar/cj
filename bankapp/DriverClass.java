package com.green.bankapp;

public class DriverClass {

	public static void main(String[] args) {
		
		Bank bnk;
		bnk=new ICICI();
		BankMain b=new BankMain();
		
		System.out.println(b.BankType(bnk));
		
		
		
		
		
	}

}
