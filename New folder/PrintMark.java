
class PrintMark extends Thread
{
	public void run()
	{
		try{
		System.out.print("Download Started.");
		for(int i=0; i<10; i++)
		{
		System.out.println(".");
		}
		
		System.out.println("Download Completed");
	
		
		}
	
		catch(Exception e)
		{
			System.out.print(e);
		}

	}

public static void main(String args[])
{

PrintMark p=new PrintMark();
Thread t=new Thread(p);
t.start();
}

}