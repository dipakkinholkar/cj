class Outer1
{
int a=10;

	class Inner1
	{
	//note: we can not declare static var in inner class.
	}
  public static void main(String args[])
	{
	Outer1 o=new Outer1();
	//System.out.print(Outer1.a); 

// without creating ref var we can not access non static variable.

//System.out.println(a);// without creating ref var we can not access non static variable.
	
	System.out.println(o.a);

	}
}