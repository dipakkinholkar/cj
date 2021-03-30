class Reverse_Number
{
public static void main(String args[])
{
	int[] arr={10,20,30,40,50};
	int i=0;

	for(i=0; i<arr.length; i++)
	{
	System.out.println(arr[i]);
	}

	System.out.println("Reverse Number");
	
	for(i=arr.length-1; i>=arr.length-5; i--)
	{
	System.out.println(arr[i]);
	}



}
}