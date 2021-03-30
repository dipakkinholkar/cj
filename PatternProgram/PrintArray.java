class PrintArray
{
	void PrintValues(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
		System.out.println(arr[i]);
		}	
	}
	public static void main(String args[])
	{
		PrintArray p=new PrintArray();
		
		int arr[]={10,20,30,40,50,60};
		
		p.PrintValues(arr);
			
	}
}