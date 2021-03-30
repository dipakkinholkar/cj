class Exception_DivideByZero
{
	public static void main(String args[])
	{
		 int a=10;
 		int b=0;
 		int c;
			try
			{
				c=a/b;
				System.out.println(c);
			}
			catch(Exception e)
			{
				System.out.println(e);   //java.lang.ArithmeticException:
			
			System.out.println("Cannot Divide by Zero");
			}
	}
}