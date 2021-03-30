import java.util.Scanner;
class FindMinNumber
{
	public int MinNumber(int mn[])
	{
		int i=0;
		for(i=0; i<mn.length-1; i++)
		{
			
			if(mn[i] < mn[i+1])
			{
			mn[i+1]=mn[i];						
			}	

			
		}
	
		int r=mn[i];
	
	return r;
	}

	public static void main(String args[])
	{
		Scanner scn =new Scanner(System.in);
		FindMinNumber fmn=new FindMinNumber();
		
		int size;
		System.out.print("Enter The Size of Array :");
		size=scn.nextInt();
		System.out.println("Enter Number :");
		
		int[] arr=new int[size];
			
		for(int i=0; i<arr.length; i++)
		{
		
			System.out.print("["+i+"]");		
			arr[i]=scn.nextInt();
			
		}
		
		System.out.println("The Minimum Number is :"+fmn.MinNumber(arr));
		

	}

}