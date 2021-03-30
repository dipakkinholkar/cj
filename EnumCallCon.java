enum EnumCallCon
{
	A(10),B(20);

	EnumCallCon(int a)
	{	
	System.out.print(a);
	}
	EnumCallCon()
	{
	System.out.print("no par constructor");
	}
	
	public static void main(String args[])
	{
	EnumCallCon e=EnumCallCon.A;	
	
	}


}