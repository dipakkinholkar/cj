class MaxMin
{
	public static void main(String args[])
	{
		int a[]={20,10,30,40,21,32,43};
		int b[]=new int[a.length];
		int i,j=1;
		
		for(int c=0; c<a.length-1; c++)
		{
			if(a[c]>a[c+1])
			{
				int temp=a[c+1];
				a[c+1]=a[c];
				a[c]=temp;
			}

		}



		for(i=0,j=b.length-1; i<=b.length-1; i++,j--)
		{
				b[j]=a[i];
		}		
		for(int k=0; k<=a.length/2; k++)
		{
			System.out.print(","+b[k]+","+a[k]);
		}

	}
}