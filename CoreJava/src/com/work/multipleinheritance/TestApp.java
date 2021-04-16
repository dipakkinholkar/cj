package com.work.multipleinheritance;

public class TestApp  extends ShowMessage{
	

	

	public static void main(String args[])
	{
		TestApp t2=new TestApp();
		System.out.print(t2.add(10, 20)+""+t2.add(20, 30));
		
		
		TestApp t=new TestApp();
		t.Welcome();
		
		// TestApp class object asigned to Interface 
		
		B b=new TestApp();
		b.Welcome();
		
		A a=new TestApp();
		a.Welcome();
		
		C c=new TestApp();
		c.Welcome();

		System.out.println(b);
		System.out.println(a);
		System.out.println(c);

		// error ClassCastException
		
		//TestApp t1=(TestApp) new ShowMessage();
		//t1.Welcome();
		
		ShowMessage show=new TestApp();
		show.Welcome();
		
		A a1=new ShowMessage();
		B b1=new ShowMessage();
		C c1=new ShowMessage();
		
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
	}

}
