class Rotate3
{
	public static void main(String args[])
	{
		int arr[][]={
			
			{1,2,3},
			{4,5,6},
			{7,8,9}
			
			};

		for(int i=arr.length-1; i>=0; i--)
		{
			for(int j=arr.length-1; j>=0; j--)
			{
				
				System.out.print(arr[i][j]+" ");
			}
		System.out.println("");
		}


	}

}


/*
		System.out.print(arr[0][0]);
		System.out.print(arr[0][1]);
		System.out.print(arr[0][2]);
		
		System.out.println(" ");

		System.out.print(arr[1][0]);
		System.out.print(arr[1][1]);
		System.out.print(arr[1][2]);
		
		
		System.out.println(" ");

		System.out.print(arr[2][0]);
		System.out.print(arr[2][1]);
		System.out.print(arr[2][2]);		
				
*/