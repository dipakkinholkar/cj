class StaticA{

	static{
	
	System.out.println("StaticA");
		}
	public static void m1()
	{
		System.out.println("M1:StaticB");
	}

}

class StaticB extends StaticA
{

	static{
	
	System.out.println("StaticB");
		}

	public static void m2()
	{
		m1();
		System.out.println("M2:StaticB");
	}

	public static void main(String args[])
	{
		m2();
	}
}