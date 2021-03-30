class A1
{
	public void taste()
	{
	System.out.println("spicy");
	}
}

class Taste
{
	public static void main(String args[])
	{
		A1 a=new A1()
		{
			public void taste()
			{
				System.out.println("salty");
			}
		};
		a.taste();
		
		A1 a1= new A1();
		
		a1.taste();
		
		A1 a2=new A1()
		{
			public void taste()
			{
			System.out.println("sweet");
			}		
		};
		
		a2.taste();
		a1.taste();
	
	System.out.println(a.getClass().getName());
	System.out.println(a1.getClass().getName());
	System.out.println(a2.getClass().getName());
	
				
	}

}

