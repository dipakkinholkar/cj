class Outer4
{
	int a=10;
	
	class Inner4
	{
		int a=20;
	
		public void m1()
		{
		int a=30;
		System.out.println(a); // local variable value // 30
		System.out.println(this.a); //instance var value 20;
		System.out.println(Outer4.this.a); // a=10;
		}
	}	

	public static void main(String args[])
	{
	new Outer4().new Inner4().m1();
	}
}