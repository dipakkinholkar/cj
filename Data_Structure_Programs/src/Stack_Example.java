class Stack_Example
{	
	int[] a=new int[10];
	
	void push(int no)
	{
		int top=0;
		int i=0;
		for( i=top; i<=a.length; i++)
		{
			a[i]=no;
			top++;
		
		}
		System.out.println(a[i]);
		
	}
	
	
	
	
	public static void main(String args[])
{
	Stack_Example obj=new Stack_Example();
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);


}
}