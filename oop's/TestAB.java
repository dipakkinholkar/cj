class A
{
	public void m1()
	{
	
	System.out.println("A:m1()");
	}
	
}

class B extends A
{
	public void m1()
	{
	
	System.out.println("B:m1()");
	}

 	public void m2()
	{
	System.out.println("B:m2()");
	}

}

class TestAB
{

	public static void main(String args[])
	{
	A a1=new A();
	a1.m1();
	
	// a1.m2(); cannot find sysmbol
	
	B b1=new B();
	b1.m1();
	b1.m2();

	A a2=new B();
	a2.m1(); 
	// a2.m2(); cannot find symbol
	 
	
	}



}