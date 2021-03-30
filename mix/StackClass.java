
class MyStack { 

	static final int MAX = 1000; 
	int top; 

	public static  int a[] = new int[MAX]; 
	
	boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
	
	MyStack() 
	{ 
		top = -1; 
	} 

	boolean push(int x) 
	{ 
		if (top >= (MAX - 1)) { 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			a[++top] = x; 
			System.out.println(x + " pushed into stack"); 
			return true; 
		} 
	} 

	int pop() 
	{ 
		if (top < 0) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = a[top--]; 
			return x; 
		} 
	} 

	int peek() 
	{ 
		if (top < 0) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = a[top]; 
			return x; 
		} 
	} 
} 

class StackClass { 
	public static void main(String args[]) 
	{ 
		int i;
		MyStack s = new MyStack(); 
		s.push(10); 
		s.push(20); 
		s.push(30); 
		for(i=0; i<3; i++)
		{
			System.out.println(MyStack.a[i]+":"+i);
		}
		
	//	System.out.println(s.pop() + " Popped from stack"); 
	} 
} 
