class Thread1 implements Runnable
{
	public void run()
	{
		
		try{
				
	String name="\t\t\t\tWELCOME TO MY PROGRAMMING WORLD !";
	
		for(int i=0; i<=name.length()-1; i++)
			{
			System.out.print(name.charAt(i));
			Thread.sleep(50);
			}


		        }		
		catch(Exception e)
		{
		System.out.println(e);
		}

	}


	

	public static void main(String args[])
	{
		Thread1 t=new Thread1();
		Thread t1=new Thread(t);
		t1.start();
		
	}

}