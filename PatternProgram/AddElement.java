class AddElement
{
	int i=0;
	public void Add(int val)
	{
	  int arr[]=new int[10];
	  arr[i]=val;
	for(int j=0; j<=arr[i]-1; j++)
	{	
	System.out.println(arr[j]);
	}
	i++;
	}
	public static void main(String args[])
	{
	AddElement a=new AddElement();
	a.Add(10);
	a.Add(10);
	a.Add(10);
	a.Add(10);
	a.Add(10);
	
	}


}