import java.util.Scanner;
class MidSearch
{


	public static void main(String args[])
	{
	int[] arr=new int[10];
    
	for(int i=0; i<arr.length; i++)
	{

		for(int j=i+1; j<arr.length/2; j++)
		{

			if(arr[i] > arr[j])
			{
				
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;

			}
		}
		
		for(int k=i; k<arr.length; k++)
		{
			
			if(arr[i] > arr[k])
			{
				
			int temp=arr[i];
			arr[i]=arr[k];
			arr[k]=temp;

			}

		}

	System.out.print(arr[i]+" ");

	}

	


	}
}