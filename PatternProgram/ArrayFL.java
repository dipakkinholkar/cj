class ArrayFL
{
	public static boolean FL(int[] a, int[] b)
	{
		
		if(a[0]==b[0])
		return true;
		else if(a[a.length-1]==b[b.length-1])
		return true;
		else
		return false;
		
	}

	public static void main(String args[])
	{
		int[] a={10,20,30};
		int[] b={1,30,0};
		
	boolean boo=ArrayFL.FL(a,b);
		System.out.println(boo);
	}
}