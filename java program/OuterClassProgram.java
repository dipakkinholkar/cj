class OuterClassProgram
{	
	int x=10;

	public class InnerClass1
	{
		int x=20;
		
		public void m1()
		{
			int x=30;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(OuterClassProgram.this.x);
	
		class InnerClass2
			{
				int x=40;
				
				public void m2()
				{
				int x=50;
				
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(InnerClass2.this.x);
				System.out.println(InnerClass1.this.x);
				System.out.println(OuterClassProgram.this.x);
												
	
				}
			}
		new InnerClass2().m2();	
		}	
	}
	
	public static void main(String args[])
	{
		new OuterClassProgram().new InnerClass1().m1();
	
	}
}