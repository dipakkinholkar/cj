class Outer11
{
	public void m1()
	{
	
	class Inner11
	{
		public void sum(int a,int b)
		{
		System.out.println(a+b);
		}
	}
	Inner11 i=new Inner11();
	i.sum(10,20);
	i.sum(20,30);		
	i.sum(30,40);
	
	i.sum(10,20);
	i.sum(20,30);		
	i.sum(30,40);
	}

public static void main(String args[])
{
Outer11 t=new Outer11();
t.m1();
}
}