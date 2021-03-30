// Java code for thread creation by extending 
// the Thread class 
class MultithreadingDemo extends Thread 
{ 
	public void run() 
	{ 
		try
		{ 
			// Displaying the thread that is running 
			System.out.println ( 
				Thread.currentThread().getId() +""+ 
				Thread.currentThread().getId()+1); 

		} 
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 

// Main Class 
public class MultiThread 
{ 
	public static void main(String[] args) 
	{ 
		int n = 100000; // Number of threads 
		for (int i=0; i<10000000; i++) 
		{ 
			MultithreadingDemo object = new MultithreadingDemo(); 
			object.start(); 
				
		}
		for (int i=0; i<100000000; i++) 
		{ 
			MultithreadingDemo object1 = new MultithreadingDemo(); 
			object1.start(); 
				
		}
		 
	} 
} 
