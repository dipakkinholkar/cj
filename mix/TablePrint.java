import java.util.Scanner;
class TablePrint
{
	public static void main(String args[])
	{
		Scanner scn=new Scanner(System.in);
		int lower,upper,x,y;
	
		System.out.println("Enter lower Range:");
		lower=scn.nextInt();
		System.out.println("Enter Upper Range:");
		upper=scn.nextInt();

		
		for(x=lower; x<=upper;x++)
		{
			
			System.out.println("---------");
		
			for(y=1; y<=10; y++)
			{
		
				
			System.out.println(x+"*"+y+":"+x*y);
			
			}
	

		
		} 

	
	}

}