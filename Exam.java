interface Foo
{
	
	void sum();

}

class Moo implements Foo
{
	public void sum()
	{
		System.out.println("sum");
	}

}

class mooTest 
{
	public static void main(String args[])
	{
		Foo f;
		
		f=new Moo();
		
		f.sum();

	}

}