class clInSideM
{

	public static void main(String args[])
	{
	
	class cl1 extends clInSideM
	{

		public void show()
		{
			System.out.print("Inside Class");
		}

		public static void main(String args[])
		{
			
		}
	}

	cl1 cl=new cl1();
	cl.show();

	}
}