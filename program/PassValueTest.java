class PassValue
{
	public PassValue()
	{
		System.out.println("no par");
	}
	public PassValue(int a)
	{
		System.out.println("int par");
	}
	public PassValue(int a[])
	{	
		for(int i=0; i<a.length; i++)
		{
		System.out.println(a[i]);
		}
	}
}

	class PassValueTest extends PassValue
	{
		public static void main(String args[])
		{
			int[] a={10,20,30,40,50};
			int i=0;
				//error: PassValueTest t1=new PassValueTest(10);
				//PassValueTest t1=new PassValueTest(10);
			PassValue t1=new PassValue();
			PassValue t2=new PassValue(10);
			PassValue t3=new PassValue(a);

		}
	}
