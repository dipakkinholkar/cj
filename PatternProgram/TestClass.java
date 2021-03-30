class TestClass
{

	int i=0;	
	public TestClass()
	{
	i=2;
	}	

	public static void main(String args[])
	{

	tprocess();
	
	}
	
	public static void tprocess()
	{
	TestClass t=new TestClass();
	System.out.println(this.i);
	}



}