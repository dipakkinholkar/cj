class LoanFactory
{
public Loan getBankName(String bankname)
{
	
	if(bankname.equals("SBI"))
	{
	return new SBI();
	}
	 else if(bankname.equals("CANARA"))
	{
	return new Canara();
	}
	else if(bankname.equals("IDFC"))
	{
	return new IDFC();
	}
	else
	{
	return null;
	}
	

}



}