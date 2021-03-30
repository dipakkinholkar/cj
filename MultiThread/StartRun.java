class StartRun extends Thread
{
	public synchronized void run()
	{
		System.out.println("running");
		try{
		Thread.sleep(1000);
		System.out.println("running");
		System.out.println(Thread.currentThread());
		System.out.println(Thread.getPriority());		
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}

	public static void main(String args[])
	{
	StartRun s=new StartRun();
	s.run();		
		
