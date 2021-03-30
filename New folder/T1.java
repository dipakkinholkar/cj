class T1 extends Thread
{
	public void run()
	{
	
	try{
	for(int i=0; i<10; i++)
	{
	System.out.print(i);
	Thread.sleep(100);
	}
	}
	catch(Exception e)
	{
	System.out.print(e);
	}
	}

	public static void main(String args[])
	{
	T1 t=new T1();
	Thread t1=new Thread(t);
	t1.start();
	
	}

}