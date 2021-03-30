class Fabonacci
{
		public static void main(String args[])	
		{
			int f=0;
			int s=1;
			System.out.print(f+","+s);
			
	for(int i=0; i<=10; i++)
	{	
			
			int sum=f+s;
			System.out.print(","+sum);
			f=s;
			s=sum;
	}	
		}
}