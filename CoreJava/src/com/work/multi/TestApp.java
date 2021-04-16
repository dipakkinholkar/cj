package com.work.multi;

public class TestApp  {
	
	public static void main(String args[])
	{
		
		FactoryApp f=new A();
		f.show();
		
		FactoryApp f1=new B();
		f1.show();
		
		FactoryApp f2=new C();
		f2.show();
		
		Top t1=new A();
		Top t2=new B();
		Top t3=new C();
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		t1.top();
		t2.top();
		t3.top();
		
		FactoryApp fa=new A();
		fa.top();
		FactoryApp fa1=new B();
		fa1.top();
		FactoryApp fa2=new B();
		fa2.top();
		
		
		
		
		
		
		
		
	}
	

}
