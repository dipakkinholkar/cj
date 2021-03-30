class Super_Con extends Example
{
	Super_Con()
	{
	super(10);
	System.out.println("Super_Con");
	}

	Super_Con(int a)
	{
	System.out.println("super_Class"+a);
	}

public static void main(String args[])	
{
	Super_Con s1=new Super_Con();
	//Super_Con s2=new Super_Con(10);
	
}



}