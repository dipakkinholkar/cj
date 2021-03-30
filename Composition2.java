class Composition1
{
	int a=10;
}

class Composition2
{
	static int a= 20;
	public static void main(String args[])
	{
	Composition1 c1=new Composition1();
	System.out.print(c1.a+""+a);
	}
}