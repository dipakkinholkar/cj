class Con1
{
	private Con1()
	{
	System.out.println("con");
	}
	
	public static void main(String args[])
	{

	new Con1();
	
	}

}
class Con2
{
	
	public static void main(String args[])
	{

	new Con1();
	
	}


}
