import java.util.Scanner;
class ArrayElementFound
{
	public boolean ElementFound(int found,int[] arr)
	{
	
		for(int i=0; i<arr.length; i++)	
		{
			if(arr[i]==found)
			return true;
		}
	return false;
	}

	public static void main(String args[])
	{

		Scanner scn=new Scanner(System.in);	
		ArrayElementFound aef=new ArrayElementFound();
		System.out.print("Enter Search Element :");
		int found=scn.nextInt();
		int[] arr={1,3,2,342,2,34,3,4,53,3,5,3,5,4,3,5,3,34456,666,777,5,555};
		System.out.println(aef.ElementFound(found,arr));	



	}

}