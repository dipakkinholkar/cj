class String1
{
	public static void main(String args[])
	{
		String s="hi hello hello hi h i";
			int count =0;

		for(int i=0; i<s.length()-1; i++)
		{
			if(s.charAt(i)=='h' && s.charAt(i+1)=='i')
			{
				count++;
			}
		
		}
		System.out.println(count);	



	}

}