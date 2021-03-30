class PatternDiamond
{
	public static void main(String args[])
	{
		
	for(int i=1; i<=4; i++)  // print rows
	{
		for(int j=1; j<=4-j; j++)
		{
			
			System.out.print(" ");
		}
		
		for(int c=1; c<2*i-1; c++)
		{
		System.out.print("*");
		}
	System.out.println("");
		
		
	}
	
	}
}