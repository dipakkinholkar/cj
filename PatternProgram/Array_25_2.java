class Array_25_2
{


	public static void main(String args[])
	{
		int arr[]={100,90,30,20,40,50,60,70,80};
		
		int temp=0;
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]<arr[i+1])
			{
			  	temp=arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
				System.out.println(arr[i]);
			}
		}	
	


	}


}