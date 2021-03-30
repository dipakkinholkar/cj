class IsClass
{
	public void account(long acc)
	{
		System.out.println(acc);
	}
	public void details(String name,String addr)
	{
	System.out.println(name+":"+addr);
	}

}

class IsRelation extends IsClass
{


public static void main(String args[])
	{
	
		IsRelation i=new IsRelation();
		
		i.account(21134434);
		i.details("dipak","parbhani");	

		
	}


}