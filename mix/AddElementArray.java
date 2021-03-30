class AddElementArray
{
		public static void main(String args[])
		{
		int n=100;
		int loc=2;
		int arr[]={10,20,30,40,50};
		
		for(int i=0; i<arr.length; i++)
		{
		System.out.println(arr[i]);
		}
	

		for(int i=arr.length; i>=loc; i--)
		{
		arr[i+1]=arr[i];	
		}	
	  	arr[loc]=n;

		for(int i=0; i<=arr.length; i++)
		{
		System.out.println(arr[i]);
		}
	
		}


}