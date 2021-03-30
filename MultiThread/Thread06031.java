class Thread06031 extends Thread
{
	public void run()
	{
		ThreadName();	
		
	}
		synchronized static  void ThreadName()
		{
		System.out.println(Thread.currentThread());
		for(int i=0; i<5; i++)
		{
		System.out.println(Thread.currentThread().getName());
		}
		}	
	
	
	
	public static void main(String args[])
	{
		Thread06031 f=new Thread06031();
		Thread t1=new Thread(f);
		Thread t2=new Thread(f);
		t1.start();
		t2.start();
	
	}

		
}