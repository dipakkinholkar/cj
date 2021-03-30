class Outer14
{
	int a=10;
	static int b=20;
	
	public void m1()
	{
		System.out.println("Outer14:m1()");
	
		class Inner14
		{
			public void m1()
			{
			System.out.println(a);
			System.out.println(b);

			}
		}	
		Inner14 obj=new Inner14();
		obj.m1();

	}
	public static void main(String args[])
	{
	Outer14 obj=new Outer14();
	obj.m1();
	}
}