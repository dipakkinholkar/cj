class FirstLast
{

	public static boolean Check(int[] arr)
	{
	
	if(arr.length-1>1 && arr[0]==arr[arr.length-1])
	return true;
	else
	return false;
	}
	
	public static void main(String args[])
	{
	int[] arr={1,2,3,4,1};	
	
	boolean b=FirstLast.Check(arr);	
		System.out.println(b);	

	}

}