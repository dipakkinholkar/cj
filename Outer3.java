class Outer3

	{
	int  a=10;	
	static int b=20;
	
		class Inner3
			{
			
			
			
				
				
					int c=new Outer3().a;
					int d=new Outer3().b;
				
					//	System.out.println(new Inner3().b);

					/* Error Code
					System.out.println(a);
					System.out.println(b);
					System.out.println(new Inner3().a);
					System.out.println(new Inner3().b);
					
					System.out.println(new Outer3().b);
					System.out.println(new Outer3().a);	
					*/

			/* error code
			int c=new Inner3().b;
			int d=new Inner3().a;
			*/
				public void m1()
					{
					System.out.println("m1():a:"+a);
					System.out.println("m1():b:"+b);
			
				System.out.println("m1():c:"+new Inner3().c);
				System.out.println("m1():d:"+new Inner3().d);	
				
		// error:System.out.println("m1():d:"+new Outer3().d);	
				
				}
			
			
			}
	public static void main(String args[])
	{
	new Outer3().new Inner3().m1();
	
	
	}
}