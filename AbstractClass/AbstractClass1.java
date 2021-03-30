class AbstractClass1 extends AbstractClass 
{
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public static void main(String args[])
	{
		AbstractClass1 a=new AbstractClass1();
		a.sum(20,20);
		a.sub(0,2);
		System.out.println(a.sub(20,30));
		
		AbstractClass a1=new AbstractClass1();
	
		System.out.println(a1.sub(10,23));
	
		a1.sub(10,23);
	}
}