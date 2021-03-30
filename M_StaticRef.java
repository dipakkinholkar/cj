interface Say
{
public void say();
}

class M_StaticRef
{
	public static void saySomething()
	{
		System.out.print("hellO");
	}

	public static void main(String args[])
	{
	Say s=M_StaticRef::saySomething;	
	s.say();

	}

}