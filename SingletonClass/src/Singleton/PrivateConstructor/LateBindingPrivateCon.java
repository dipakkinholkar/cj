package Singleton.PrivateConstructor;

public class LateBindingPrivateCon {
	
	private static LateBindingPrivateCon l=null;
	
	private LateBindingPrivateCon(int a ,int b)
	{
		int c=a+b;
		System.out.print(c);
	}
	
	public static LateBindingPrivateCon getLateBindingPrivateCon(int a, int b)
	{
		if(l==null)
		{
			l=new LateBindingPrivateCon(a,b);
		}
		
		return l;
	}
	

}
