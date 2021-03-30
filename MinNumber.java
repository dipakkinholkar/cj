class MinNumber
{
	public static void main(String args[])
	{
		int no[]={1,2,1,3,4,54,3,332,234};
		int i=0;
		for(i=0; i<no.length-1; i++)
		{
			if(no[i] > no[i+1])
			{
			
			no[i+1]=no[i];
		
		
			}		


		}
		
			System.out.print(no[i]);		
		

		}
}