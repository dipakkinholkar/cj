package com.basic.thread;

public class Thread1Run extends Thread {

	public void run()
	{
		
		try {
		
		String name="Dipak Kinholkar";
			
			for(int i=0; i<name.length(); i++)
			{
			
			System.out.print(name.charAt(i));
			Thread.sleep(100);
			}
			} 
		catch (InterruptedException e) {
			
			
			e.printStackTrace();
		}
		
		
	}
	
	
		
		
	
	
	
	
	public static void main(String[] args) {
	
		Thread1Run t=new Thread1Run();
		t.start();
		
	}

}
