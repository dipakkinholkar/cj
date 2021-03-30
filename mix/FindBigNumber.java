class FindBigNum
{
	public static void main(String args[])
	{
	int arr[5]={10,20,20,10,40};

	
		for(int i=0; i<arr[5]-1; i++)
		{
		
		if(arr[i]>arr[i+1])
		{
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;	
		}		

		}
	
	

	}

}