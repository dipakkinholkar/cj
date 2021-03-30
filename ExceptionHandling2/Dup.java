class Dup
{
	public static void main(String args[])
	{
	String[] arr={"java","servlet","jsp","java","jdbc","servlet", "servlet"};
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length; j++)
		{
			
			if(arr[i]==arr[j])
			{
				
				System.out.println(arr[j]);
			}
		
		}
	}
		



	}
}