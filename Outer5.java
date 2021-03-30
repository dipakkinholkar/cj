class Outer5
{
	class Outer6
	{
		class Outer7	
		{	
			int a=10;
			
			public void m1()
				{
				System.out.println(a);
				}		
		}
	}
public static void main(String args[])
	{
	
	Outer5 f=new Outer5();
	Outer5.Outer6 s=f.new Outer6();
	Outer5.Outer6.Outer7 s1=s.new Outer7();
	
	s1.m1();
	
	} 
}