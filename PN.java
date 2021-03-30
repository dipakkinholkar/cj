import java.util.Scanner;
class PN
{
public static void main(String args[])
{
Scanner scn=new Scanner(System.in);
int count=0;
System.out.print("Enter Number :");
int n=scn.nextInt();
for(int i=1; i<=n; i++)
{

	if(n%i==0)
	{
	count=count+1;
	}
	}

	if(count==2)
	{
	System.out.println(n+": is Prime Number");
	}


	if(count!=2)
	{
	System.out.println(n+" :is not Prime Number");
	}


}
}