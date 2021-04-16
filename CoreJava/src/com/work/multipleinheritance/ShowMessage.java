package com.work.multipleinheritance;

public class ShowMessage implements B , C {

	@Override
	public void Welcome() {
	
		System.out.println("Welcome to App");
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	

}
