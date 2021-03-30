package com.green.bankloan;

public class BankFactory  extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
	
		if(bank==null)
		{
			return null;
		}
		else if(bank.equalsIgnoreCase("SBI"))
		{
			return new SBI();
		}
		else if(bank.equalsIgnoreCase("ICICI"))
		{
			return new ICICI();
		}
		else if(bank.equalsIgnoreCase("HDFC"))
		{
			return new HDFC();
		}
		return null;
	}

	@Override
	public Loan getLoan(String loan) {

		return null;
	}
}
