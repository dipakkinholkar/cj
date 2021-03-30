class ArraySum
{
	public static int sum(int[] a)
	{
	return a[0]+a[1]+a[2];	
	}
	
	public static void main(String args[])
	{
	int[] a={10,20,30};
	int sum=ArraySum.sum(a);	
		
	System.out.println(sum);
	}

}