class Outer12
{
 	public static void m1()
	{
		class Inner12
			{
				public void sum(int a,int b)
					{
					System.out.println(a+b);	
					}
				
			}
			Inner12 i=new Inner12();
			i.sum(10,20);
			i.sum(10,20);
			i.sum(10,20);
			i.sum(10,20);
				
		
		
	
	}

	public static void main(String args[])
		{
		Outer12 t=new Outer12();
			
		// t.m1(); // by using object 
		
		Outer12.m1(); // by using classname
		}
}