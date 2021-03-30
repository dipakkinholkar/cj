interface OuterInterface
{	
	public void add();

	interface InnerInterface
	{
	public void add();	
	}

}

class Interface1 implements OuterInterface
{
public void add()
{
System.out.println("add-class");
}
}


class TestInter extends Interface1 implements OuterInterface
{
	public void add()
	{
	System.out.println("Hello");
	}


public static void main(String args[])
{

TestInter f=new TestInter();
f.add();
Interface1 i=new Interface1();
i.add();
}

}