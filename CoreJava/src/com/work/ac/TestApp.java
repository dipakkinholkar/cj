package com.work.ac;

public class TestApp {
	
	
	public static void main(String args[])
	{
		// new A() not possible because A class is abstract class
		
		Top aa=new AA();
		Top bb=new BB();
		Top cc=new CC();
		
		aa.top();
		bb.top();
		cc.top();
		
		// aa.factory(); can't call because factory method not declared in top interface
		
		Factory faa=new AA();
		faa.factory();
		faa.top();
		
		
	}

}
