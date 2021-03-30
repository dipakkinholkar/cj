class EarlyBinding
{
	private static EarlyBinding e=new EarlyBinding();

private EarlyBinding()
{

}

	public static EarlyBinding getEarlyBinding()
	{
	
	return e;
	}

	public int add(int a , int b)
	{
	return a+b;
	}

}