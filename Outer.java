class Outer
{
	private   String name="dipak";

	public static class innerStatic
	{
		public void message()
		{
			System.out.print("name:"+name);
		}
	}

	public static void main(String args[])
	{
		Outer.innerStatic outer=new Outer.innerStatic();
		outer.message();
	}
}
