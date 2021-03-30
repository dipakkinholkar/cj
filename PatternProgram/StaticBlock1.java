class StaticBlock1
{

static int sum=addValue(10,20);
static int sub=subValue(10, 20);
	
	public static  int addValue(int a, int b)
	{
			return a+b;
	}
	
	public static int subValue(int a, int b)
	{			
			return a-b;
	}


	

	public static void main(String []args)
	{
		
		System.out.println(sum);
		System.out.println(sub);
	
	}
		
	
}