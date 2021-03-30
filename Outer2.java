class Outer2
{
	int a=10;
	static int b=20;
	
	class Inner2
	{
	// static int c=10; -->CE: we cannot declare static var but we access static
	// var from outer class
	
	// We have to create obj of Inner2 class
	// System.out.println(a); identifier expected.
	// System.out.println(b);    identifier expected.
	
	
	// System.out.println(inn.a); identifier expected.
	// System.out.println(inn.b); identifier expected. 
	
	// by using outerclass object with innerclass instance we can access outer class	

	//System.out.println(new Outer2().new Inner2()); //c error
	// error ->  new Outer2().new Inner2();
	// System.out.println(new Inner().b);
	// System.out.println(b);
	
	
	}
	
		public static void main(String args[])
		{
		Outer2 obj=new Outer2();
		
		System.out.println(obj.a); //10
		System.out.println(b);     //20
		
		//Inner2 inn=new Inner(); // cannot find a symbol
				//System.out.println(inn.a);  variable inn of 				//type Outer2.Inner2
		//	System.out.println(inn.b); cannot find symbol b		


		//System.out.println(new Outer2().new Inner2().b); cannot find b

		System.out.println(new Outer2().b); //20
		System.out.println(new Outer2().a); //10
	
		System.out.println(new Outer2().new Inner2()); // print hashcode
		new Outer2().new Inner2();
	
			
}
}