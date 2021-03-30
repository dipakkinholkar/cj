import java.util.Scanner;
class BankFunction
{
	
	static Scanner scn=new Scanner(System.in);
	
	public void Details(long accNo , String accName,long bal,String accType)
	{
		System.out.println("AccountNumber:"+accNo);
		System.out.println("AccountName:"+accName);
		System.out.println("AccountBalance:"+bal);
		System.out.println("AccountType:"+accType);
			
	}
	public long Deposit(long bal)
	{
		System.out.print("Enter Deposit Amount :");	
		long tempbal=scn.nextLong();
		bal=bal+tempbal;
		System.out.println("Amount Deposited: "+bal);
		return bal;
	} 
	
	public long Withrows(long bal)
	{		
		
		System.out.print("Enter Withdrow Amount");
		
		long tempbal=scn.nextLong();
		
		if(bal<tempbal)
		{
		System.out.println("Insufficient Balance");		
		}
		
	return bal;	
	}

}

class BankApp extends BankFunction
{
	static Scanner scn=new Scanner(System.in);

	public static void main(String args[])
	{
	BankApp b=new BankApp();
	long bal=5000;
	String accType="Saving";	
	
	System.out.print("Enter a Name");
	String accName=scn.next();	
	System.out.print("Enter Account Number");	
	long accNo=scn.nextInt();
	BankFunction bf=new BankFunction();
	System.out.println("1 : Account Details");
	System.out.println("2 : Money Deposit");
	System.out.println("3 : Money Withrows");
	
	System.out.print("Enter your Choise :");
	int i=scn.nextInt();
	
	switch(i)
	{
	case 1:
		bf.Details(accNo,accName,bal,accType); break;	
	case 2:
		bf.Deposit(bal);
	case 3:
		bf.Withrows(bal);
	}	
	
	}
}