class EarlyBindingAccess
{

	public static void main(String args[])
	{
		EarlyBinding e=EarlyBinding.getEarlyBinding();
		
			System.out.println(e.hashCode());	
	
	int a=e.add(10,20);
	System.out.println(a);

	}

}