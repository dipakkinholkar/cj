package com.work.interfaces;

public abstract class Division extends Operation {

	
	double c;
	
	@Override
	public double div(double a , double b) 
	{
		
		try {
			
			 c=a/b;
			
		}
		catch(Exception e)
		{
		System.out.print(e);	
		}
		
		
		return c;
	}
	
	
}
