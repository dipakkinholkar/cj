class OuterClass
{
  int a=10;
  static int b=20;
	
	public void m1()
	{
	System.out.println(a);
	System.out.println(b);
	}
	
	

class InnerClass
{
	public void m1()
	{
	System.out.println(a);
	System.out.println(b);
	}
}
public static void main(String args[])
{

OuterClass c=new OuterClass();
OuterClass.InnerClass i=c.new InnerClass();
i.m1();
c.m1();
}
}