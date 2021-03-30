class FinalVariable
{
final int a=10;
	
   public void m1(int b)
	{
	int c;
	c=b;
	System.out.println(c);
	}
}

class FinalVariableTest extends FinalVariable
{	

	public static void main(String args[])
	{
	FinalVariableTest f=new FinalVariableTest();
	System.out.println(f.a);
	//f.m1(10);
	FinalVariable ff=new FinalVariable();
	ff.m1(20);
	}
}