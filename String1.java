class String1 
{
	public char[] Str(String name)
	{
		char[] arr=name.toCharArray();				
		
	return  arr;	
}


public static void main(String args[])
	{
	String1 s=new String1();
	String s1="hello dipak";
	
	char[] arr=s.Str(s1);
	

	for(int i=arr.length-1; i>=0; i--)
	{
		System.out.print(arr[i]);
	}


	}
}