interface Abs1
{
	public void sub();
	public void sum();	
}
abstract class Abs implements Abs1
{
	public void sub()
	{
		System.out.println("sub");
	}
	
	public void sum()
	{
		System.out.println("sum");
	}	
}
abstract class Abs2 extends Abs
{
	public void sub()
	{
		System.out.println("sub1");
	}
	
	public void sum()
	{
		System.out.println("sum1");
	}	

}

class AbstractClass extends Abs implements Abs1 
{
	
	public static void main(String args[])
	{
	AbstractClass a=new AbstractClass();
	a.sub();		
	a.sum();				

	}



}