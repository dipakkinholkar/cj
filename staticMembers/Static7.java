class Static7
{
		 static void m1()
		{
			System.out.println("m1");
		}			

	public static void main(String []args)
	{
	Static7.m1();
	new Static7().m1();
	Static7 s=new Static7();
	s.m1();
	}
	
	
}