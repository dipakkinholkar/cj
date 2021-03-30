package Singleton.PrivateConstructor;

public class EarlyBindingPrivateCon {
	
	private static EarlyBindingPrivateCon e =new EarlyBindingPrivateCon(10,20);


	private EarlyBindingPrivateCon(int a, int b)
	{
	int c=a+b;	
		System.out.print(c);
	}
	


	
	
	public static EarlyBindingPrivateCon getEarlyBindingPrivateCon(int a , int b)
	{
		
		return e;
	}
	

	}
