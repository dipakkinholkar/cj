class LocalClass1
{
	public void show()
	{
		class LC
		{
			public void show()
			{
				System.out.print("LC:show");
			}
		} 
		
		LC l=new LC();
		l.show();
	}

	public static void main(String args[])
	{
		LocalClass1 lc=new LocalClass1();
		lc.show();
	}
}