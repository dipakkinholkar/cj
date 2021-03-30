class FindDuplicate
{

	public static void main(String args[])
	{
	
		String name="welcome java hyderabad";

		char[] arr=name.toCharArray();
		int count=1;
		for(int i=0; i<arr.length; i++)
		{

			for(int j=i+1; j<arr.length; j++)
			{
				
				if(arr[i]==arr[j])
				{
					System.out.print(arr[j]);
					count++;
					break;
				}
				
			}
		}	


	}


}