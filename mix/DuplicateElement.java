class DuplicateElement
{

	public static void main(String args[])
	{

		try{
		int arr[]={10,20,30,10,20,10};
		int n=10;
		int count=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==n)
			{
			++count;	
			}
		}
		System.out.println(n+":is Duplicate in array times:"+count);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

}