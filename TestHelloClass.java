interface HelloPrint
{
	public void helloprint();
	
	class PrintClass
	{
		public void helloprint()
		{
			System.out.println("hello");
		}
	}
}

class TestHelloClass implements HelloPrint
	{
		public void helloprint()
		{
		System.out.println("hello1");
		}
		
		public static void main(String args[])
		{		
			PrintClass obj=new PrintClass();
			obj.helloprint();
			TestHelloClass t=new TestHelloClass();
			t.helloprint();	
		}
	}	
