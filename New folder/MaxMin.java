class MaxMin
{
	public static void main(String args[])
	{
	int arr[] ={10,23,22,23,33,34,21};
	
	int i=0;
	for(i=0; i<arr.length; i++)
	{
		
		for(int j=i+1; j<arr.length; j++)
		{	
			if(arr[i]<arr[j])
			{
			arr[i]=arr[j];				
			}

		}

	}			

				System.out.print(arr[i]);
	
	}
}