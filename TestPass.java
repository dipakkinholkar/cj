interface Op
{
	public void operation(EmpClass e);
	
	class EmpClass 
	{
		public void operation(EmpClass e)
		{
		System.out.println(e);
		}
	}
}
class TestPass implements Op
{
 public void operation(EmpClass e)
	{
	System.out.println("Hello");
	}

public static void main(String args[])
{
	
	EmpClass ee=new EmpClass();
	
	TestPass t=new TestPass();	
	t.operation(new EmpClass());


}
}