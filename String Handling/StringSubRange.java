class StringSubRange
{
	public static void main(String args[])
	{
	
	char chr[] = {'a','b','c','d','e','f','g','h','i'};

		
		String str=new String(chr,0,5);
		
		System.out.println(str);
		
		String s1=new String(str);
		
		System.out.println(s1);

		System.out.println(s1==str); // false
		
	
	}

}