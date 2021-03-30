class Outer15
{
	 static int a=10;
	static int b=20;
	
// we declare m1() method is static.so error: a is not a static var so inside static //method how we can access the value of non static var if u want to access it declare
// a as static or remove m1() as static .
	
	public static void m1()      // declare a as a static or remove static m1()
	{
		System.out.println("Outer15:m1()");
	
		class Inner15
		{
			public void m1()
			{
			System.out.println(a);
			System.out.println(b);

			}
		}	
		Inner15 obj=new Inner15();
		obj.m1();

	}
	public static void main(String args[])
	{
	Outer15 obj=new Outer15();
	obj.m1();
	}
}