enum ColorSystem
{
	Blue
	{
	},
	Red
	{
		public void info()
		{
			System.out.println("Dangarous color");
		}	
	},
	Green;
	
	public void info()
	{
		System.out.println("Universal Color");
	}

}

class TestColor
{
	public static void main(String args[])
	{
	ColorSystem[] cs=ColorSystem.values();	
	
	for(ColorSystem c : cs)
	{
	c.info();
	}	
	
	}
}