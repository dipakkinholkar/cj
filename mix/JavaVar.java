class JavaVar
{
	public int a; // instance var with def value 0

	public static int b; // static var with def value 0.

	public static void main(String args[])
	{
		int a=10; //local var with need initialize value
		
	JavaVar obj=new JavaVar();

	System.out.println(a); // local value 10			
	
	System.out.println(b); // static vr def value 0
	System.out.println(JavaVar.b); // static vr def value 0
	System.out.println(obj.b); // static vr def value 0
	
	System.out.println(obj.a); // 0
	System.out.println(new JavaVar().a); // 0
	
	}


}