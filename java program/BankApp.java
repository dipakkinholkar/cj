class BankApp
{
	public void getAccount(long accNo)
	{
		if(accNo==123)
		{
		getInfo();
		}
	}
	public void getInfo()
	{
	System.out.println("Acc:123");
	System.out.println("Name:Naresh");
	System.out.println("Type:Saving");
	System.out.println("Add:PBN");
	}

	public static void main(String args[])
	{
	BankApp b1=new BankApp();
	b1.getAccount(123);	
	}

}