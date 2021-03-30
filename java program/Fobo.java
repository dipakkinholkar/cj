class Fabo
{
		public static void main(String args[])
		{
		
		int f=0;
		int s=1;
		int temp;
		
		System.out.println(f+","+s);
		for(int i=0; i<10; i++)
		{
		
		temp=f+s;
		System.out.println(temp+",");
		f=s;
		s=temp;		
		}
		
			
		}	
}