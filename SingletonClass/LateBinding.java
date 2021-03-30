class LateBinding
{
	private static LateBinding e=null;

private LateBinding()
{

}

	public static LateBinding getLateBinding()
	{
		if(e==null)
		{
		e=new LateBinding();	
		}
	return e;
	}

}