class Thread2 implements Runnable
{
	public void run()
	{
		
		try{
				
	String name="DIPAK";
	
		for(int i=0; i<=name.length()-1; i++)
			{
			System.out.print(name.charAt(i));
			Thread.sleep(5000);
			}
		
				

		        }		
		catch(Exception e)
		{
		System.out.println(e);
		}

	}


	

	public static void main(String args[])
	{
		Thread2 t=new Thread2();
		Thread t1=new Thread(t);
		t1.start();
		
	}

}