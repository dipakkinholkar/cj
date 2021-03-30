class Outer13
{
	public void m1()
	{
		class Inner13
			{
				// we can not use static var method but we access it.
				public void sum(int a,int b)
				{
				System.out.println(a+b);
				}
			
			}
		
	Inner13 i=new Inner13();
	i.sum(10,20);
	}

public static void main(String args[])
	{
	Outer13 obj=new Outer13();
	obj.m1();
	}
}