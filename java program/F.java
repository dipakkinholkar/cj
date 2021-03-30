class F
{
		public static void main(String args[])
		{
		
		int f=0;
		int s=1;
		int temp;
		
		System.out.print(f+","+s+",");
		for(int i=0; i<10; i++)
		{
		
		temp=f+s;
		System.out.print(temp+",");
		f=s;
		s=temp;		
		}
		
			
		}	
}