package earlybindingatLoadingtime;

public class EarlyBindingClass {

	private static EarlyBindingClass e=new EarlyBindingClass();
	
	private EarlyBindingClass()
	{
		
		
	}
	
	public static EarlyBindingClass getEarlyBindingClass()
	{
		
		return e;
	}
	
	public int add(int a, int b)
	{
		
		return a+b;
	}
	
	
}
