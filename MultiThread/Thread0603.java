class Thread0603 extends Thread
{
	public void run()
	{
		criticalSection();	
	}
	
		synchronized static void criticalSection()
		{
		int p=Thread.currentThread().getPriority();
	
		String s=Thread.currentThread().getName();
	
		System.out.println("Priority of"+s+"==>"+p);
	
			for(int i=0; i<5; i++)
			{
			System.out.println(s+"===>"+i);
			}
	
		}

	public static void main(String args[])
	{
		Thread0603 f=new Thread0603();
		Thread t1=new Thread(f);
		Thread t2=new Thread(f);
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		
	t1.start();
	t2.start();
	
	}

		
}