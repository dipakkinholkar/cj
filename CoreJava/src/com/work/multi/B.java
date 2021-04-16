package com.work.multi;

public class B implements FactoryApp {

	@Override
	public void show() {

		System.out.println("B : show()");
	}

	@Override
	public void top() {
		System.out.println("B : Top()");
		
	}

}
