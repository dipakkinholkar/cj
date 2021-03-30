class Outer8
{
	int a=10;
	public void m1()
	{
	System.out.println("Outer8:"+a);
	}
	class Outer9
	{
		int a=20;
			public void m1()
				{	
				System.out.println("Outer9:"+a);
				}
		class Outer10	
		{	
			int a=30;
			
			public void m1()
				{
				System.out.println("Outer10:"+a);
				}		
		}
	}
public static void main(String args[])
	{
	
	Outer8 f=new Outer8();
	f.m1();
	Outer8.Outer9 s=f.new Outer9();
	s.m1();
	Outer8.Outer9.Outer10 s1=s.new Outer10();
	s1.m1();
	
	} 
}