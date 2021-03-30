import java.util.Scanner;
class Asign_2
{
	public static void main(String args[])
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n=scn.nextInt();	
	int s=0;
	for(int i=0; i<n; i++)
	{
	s=s*10+1;	
	System.out.println(s+",");
	}
	

	

	}
}