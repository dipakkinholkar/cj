class CopyArray
{
	public static void main(String args[])
	{
		String[] a=new String[10];
		String[] b=new String[10];
		
		for(int i=0; i<b.length; i++)
		{
			a[i]=" "+i*2;
			b[i]=a[i];
			System.out.println(a[i]+""+b[i]);
		}
		for(int i=0; i<a.length; i++)
		{
		}
		
	}
}