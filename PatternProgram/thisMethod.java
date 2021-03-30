class superMethod
{
	int a;
	int b;
	public superMethod(int a, int b)
	{
		this.a=a;
		this.b=b;			
	}	
	void display()
	{
	System.out.println(a);
	System.out.println(b);	
	}

}

class thisMethod
{

	int a; 
	int b; 
	
	thisMethod(int a, int b) 
	{ 
		this.a = a; 
		this.b = b; 
	} 

	void display() 
	{ 
		//Displaying value of variables a and b 
		System.out.println("a = " + a + " b = " + b); 
	} 

	public static void main(String[] args) 
	{ 
		superMethod s=new superMethod(10,20);
		
		s.display();
		
		thisMethod obj=new thisMethod(10,20);


		obj.display(); 

		} 



}