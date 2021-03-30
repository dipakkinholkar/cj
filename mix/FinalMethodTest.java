class FinalMethod
{
	public void m1()
	{
	System.out.println("m1");
	}
	
	public final void m2()
	{
	System.out.println("m2");
	}


}
class FinalMethodTest extends FinalMethod
{
	public void m2()
	{
	 	System.out.println("m2-overide");
	}

public static void main(String arg[])
{
FinalMethodTest f=new FinalMethodTest();
f.m1();
f.m2();
}
}