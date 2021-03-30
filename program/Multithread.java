class MultithreadingDemo extends Thread 
{ 
	public void run() 
	{ 
		int a=10;
		int b=20;
	
		try
		{ 
		System.out.println("Addition Program Thread"+(a+b));			
		
		} 
		catch (Exception e) 
		{ 
			System.out.println ("Exception is caught"); 
		} 
	} 
}
class MultithreadingDemo1 extends Thread 
{ 
	public void run() 
	{ 
		try
		{ 
		System.out.println("Substraction Program Thread");			
		} 
		catch (Exception e) 
		{ 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 
 

// Main Class 
public class Multithread 
{ 
	public static void main(String[] args) 
	{ 
			MultithreadingDemo object = new MultithreadingDemo(); 
			MultithreadingDemo1 object1 = new MultithreadingDemo1(); 
			
			object.start(); 
			object.start();
	} 
} 
