import java.util.Scanner;
class CountBits
{
public static void main(String args[])
{
	int n=0;
	int m, count=0;
	String x="";
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a No:");
	n=scn.nextInt();	
	
	while(n>0)
	{
		int a=n%2;
		
		x=a+x;
		
		n=n/2;	

	}
	
	int l=x.length();
	
	for(int i=0; i<l; i++)
	{
	
	if(x.charAt(i)=='1')
	{
	count++;
	}
	
	}	
	
	System.out.println("9 number bits:"+count);	



}

}