class AnoInnClassRunnable
{
	public static void main(String args[])
	{
		Runnable r=new Runnable()
		{
			public void run()
			{
				for(int i=0; i<=10; i++)
				{
					System.out.println("ChildThread");
				}
			}
		};
	Thread t=new Thread(r);
	r.run();
				for(int i=0; i<=10; i++)
				{
					System.out.println("mainTread");
				}
			
	}

}