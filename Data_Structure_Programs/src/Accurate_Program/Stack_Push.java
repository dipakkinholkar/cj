package Accurate_Program;

public class Stack_Push {
	
	int[] stack=new int[6];
	int top=0;
	int i;
	
	public void push(int data)
		{
		stack[top]=data;
		top++;
		}
	
	public void show()
	{
		for( i=0; i<=stack.length; i++ )
		{
		System.out.println(i+"="+stack[i]);	
		}
	}
	public int pop()
	{
		int data;
		top--;
		 data=stack[top];
		stack[top]=0;
		
		return data;
	}
	
	public int peek()
	{
		int data;
		data=stack[top-1];
		return data;
	}
	
	
	
	
	

}
