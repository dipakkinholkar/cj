class ArrayMissNumber
{
	public static void main(String args[])
	{
		int ar[]={1,2,3,5,6,7,8,10};

		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]==4 || ar[i]==9)
			{
				System.out.print(ar[i]);
			}
			else
			{
				
				System.out.print("No miss");	
			}
			

		}		



	}
}