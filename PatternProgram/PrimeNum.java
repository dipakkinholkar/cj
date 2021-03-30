class PrimeNum
{

	public static void main(String args[])
	{
		
		
		int arr[]=new int[50];
		for(int i=2; i<=arr.length-1; i++)
		{
			arr[i]=i;			
			for(int j=2; j<i; j++)
			{
				if(arr[i]%j==0)
				{
					System.out.println(arr[i]+"is a prime number");
				
				}

		
			}


		}
		
	}


}