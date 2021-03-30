package com.basic.runnable;

public class Runnable1 implements Runnable {

	public void run() {
		
		System.out.println("running");
		
	}
	
	
	public static void main(String args[])
	{
		Runnable1 r=new Runnable1();
		Thread t=new Thread(r);
		t.start();
		
	}
	
	
	
	
	

}
