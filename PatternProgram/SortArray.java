class SortArray
{
	public void ArrSort(int arr[])
	{
		int i;
		for(i=0; i<arr.length-1; i++)
		{
			
		 	for(int j=0; j<arr.length-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}

			System.out.println(arr[j]);
	
		}		

	}

	public static void main(String args[])
	{
		SortArray s=new SortArray();
		int arr[]={10,20,10,20,2304,2304,243,34,23};
	
		s.ArrSort(arr);
		
		
	
	
	}

}