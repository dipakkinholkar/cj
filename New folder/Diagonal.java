class Diagonal
{
	public static void main(String args[])
	{
		int arr[][]={
				{1,2,3},			
				{4,5,6},
				{7,8,9}
			    };


		for(int n=0; n>=0; n++)
		{
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
				{
					if(arr[i]==arr[j])
					{
						System.out.print(j);
					}
				}
			}
		}





	}

}