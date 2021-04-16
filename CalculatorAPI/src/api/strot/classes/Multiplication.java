package api.strot.classes;

import api.strot.calculator.Operation;

public abstract class Multiplication extends Substraction {

	@Override
	public double mul(double a , double b)
	{
		return a*b;
	}
	
}
