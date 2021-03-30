class RunCar implements Runnable

{

	public void run()
	{
		for(int i=0; i<10; i++)
		{
		System.out.println("Child");
		}
	}

}
class TestCar
{
		public static void main(String args[])
		{
		RunCar r=new RunCar();
		Thread t=new Thread(r);
		t.run();	
				
		for(int i=0; i<10; i++)
		{
		System.out.println("main");
		}
		

		}

}