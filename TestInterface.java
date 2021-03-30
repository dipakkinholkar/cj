interface Add
{
public void add();
}

class TestInterface
{
	public void add()
	{
		System.out.println("add");
	}

	public static void main(String args[])
	{
	TestInterface f=new TestInterface();
	f.add();	

	}
}