class MethodClass
{

	public void m1()
	{
	System.out.println("MethodClass:m1");
	}


}



class MethodOverriding extends MethodClass
{
	public void m1()
	{
		super.m1();
	System.out.println("MethodOverriding:m1");
	}
	
	public static void main(String args[])
	{
		MethodOverriding m=new MethodOverriding();
		m.m1();
	}


}