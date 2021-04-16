package api.strot.classes;

import api.strot.calculator.Operation;

public class Division extends Multiplication {

	
	@Override
	public double div(double a , double b)
	{
		if(b==0)
		{
			System.out.println("Can't Divide by zero");
			return 0;
		}
		return a/b;
	}
	
}
