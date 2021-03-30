class AnoInnClThread
{
	public static void main(String args[])
	{
		Thread t=new Thread()
		{
			public void run()
			{
				for(int i=0; i<2; i++)
				{
					System.out.println("t");
			
				}
			}
		};
		Thread t1=new Thread()
		{
			public void run()
			{
				for(int i=0; i<2; i++)
				{
					System.out.println("t1");
			
				}
			}
		};
	
	t.run();
	System.out.println(t.getClass().getName());	
	t1.run();
	System.out.println(t.getClass().getName());	
	
	}

}