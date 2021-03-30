class Outer16
{
	
	public void m1()     
	{
	int a=10000;
		
		class Inner16
		{
			public void m2()
			{
			System.out.println(a);
			}
		}	
		Inner16 i=new Inner16();
		i.m2();

	}
	public static void main(String args[])
	{
	Outer16 obj=new Outer16();
	obj.m1();
	}

}