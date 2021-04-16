package com.dipak.test;
import api.strot.calculator.Operation;
import api.strot.classes.Addition;
import api.strot.classes.Division;

public class Test {

	public static void main(String[] args) {
		
		Operation add=new Division();
		double result=add.div(1000,200);
		System.out.print(result);
		
		
	}

}
