class StringCharArray
{
	public static void main(String args[])
	{
	String name="hello dipak";
	
	char[] arr=new char[name.length()];
	int i;
	for(i=0; i<arr.length; i++)
	{
		arr[i]=name.charAt(i);
	}

	for( i=0; i<arr.length; i++)
	{
	System.out.print(arr[i]);

	}


	}
}