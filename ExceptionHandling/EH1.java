class EH1
{
	public void add(int a, int b)
	{
		int c;
		try{
			
			c=a/b;
			
		System.out.print(c);
      		   } 
		catch(Exception e)
		{
			b++;
		System.out.println("Can not Divide By Zero ");
		add(a,b);
		}

	}


	public static void main(String args[])
	{
	new EH1().add(10,0);		


	}

}