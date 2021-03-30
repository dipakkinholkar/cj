import java.util.Scanner;
class Asign_3
{
	public static void main(String args[])
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=scn.nextInt();	
	
	for(int i=1; i<=n; i++)
	{
		if(i%2==1)
		{
		System.out.print(i);
		}
		
	}
	
	

	}
}