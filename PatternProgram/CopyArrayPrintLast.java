class CopyArrayPrintLast
{
	public static int[] PrintLast(int[] arr)
	{
		int temp=arr.length-1;
		
		
		int newarr[temp-1]=arr[arr.length-1];
		
			
	return temp;
	}
	
	public static void main(String args[])
	{
		int[] arr={1,2,4,43,23,34};
	int[] t=CopyArrayPrintLast.PrintLast(arr);
	
	for(int i: t)
{
		System.out.println(t);
	
	}

}