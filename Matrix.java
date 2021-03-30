class Matrix
{
	public static void main(String args[])
	{
	char arr[][]={
			{'A','A','A'},
			{'B','B','B'},
			{'C','C','C'}
	
			};

		for(int k=0; k<=2; k++)
		{
			for(int i=0; i<=2; i++)	
			{
				for(int j=i; j<=i; j++)
				{
					System.out.print(arr[i][i]);
				}			


			}
		System.out.println("");			
}


	}



}