class StaticInnerClass1
{
	static class A
	{
		static void m1()
		{
			System.out.println("StiticClass:m1()");
		}
		public void m2()
		{
			System.out.println("StiticClass:m2()");	
		}
	}

public static void main(String args[])
	
	{
	A.m1();
	A a=new A();
	a.m2();
		
	}
}