import java.util.Scanner;
class RotateArray
{
	public static void main(String args[])
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a Number");
		
	int arr[]={1,2,3,4,5,6,7};
	
	int n=scn.nextInt();
	

	for(int i=n; i<=arr.length-1; i++)
	{
		System.out.print(arr[i]);
	}
	for(int j=0; j<n; j++)
	{
		System.out.print(arr[j]);
	}
		


	}

}