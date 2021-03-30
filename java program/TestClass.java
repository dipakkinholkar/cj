class FirstClass
{
	static{
		
		System.out.println("FirstClass:Static");
	      }
	
	public FirstClass() 
	{
	System.out.println("FirstClass:Constructor");
	}


}

class SecondClass

{
	 static{

		System.out.println("SecondClass:Static");
	
	}
	
	public SecondClass() 	{
		
	System.out.println("SecondClass:Constructor");
	
	}
}

public class TestClass
{
	static{ System.out.println("TestClass:Static");}

	public static void main(String args[]) throws ClassNotFoundException
	{
	System.out.println("Testclass:MainMethod");
	
	SecondClass f=new SecondClass();
	SecondClass f1=new SecondClass();

	Class.forName("FirstClass");
	Class.forName("FirstClass"); // First Class load only once
	
	Class.forName("SecondClass");
		
	System.out.println("TestClass:End Main");
	}
}