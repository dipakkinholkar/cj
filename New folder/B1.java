class A1
{

	public void m1()
	{
	
	System.out.print("m1"	);
	}

}

class B1
{
	public void m2(A1 a)
	{
	a.m1();
	}

	public static void main(String arg[])
	{
		B1 b=new B1();
		b.m2();
	}


}