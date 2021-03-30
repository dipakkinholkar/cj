class RotateArray1
{
	public static int[] Rotate(int[] a)
	{
	int temp;
	temp=a[0];
	a[0]=a[2];
	a[2]=temp;
	return a;
	}

	public static void main(String args[])
	{
	int[] a={1,2,3};
	
	int[] aa=RotateArray1.Rotate(a);
	
	for(int i : aa)
	{
	System.out.println(i);
	}
		

	}



}