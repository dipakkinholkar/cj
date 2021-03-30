interface Login
{
	public void logintest(String name,String pass);
	class Test
	{
	public void logintest(String name,String pass)
	{
		if(name.equals("hello") && pass.equals("dipak"))
		{
			System.out.println("Login successfully");
		}	
		else
		{
			System.out.println("Login failed!");	
		}
	}
	}

}
class TestLogin implements Login
	{
	public void logintest(String name,String pass)
	{
		if(name.equals("dipak") && pass.equals("dipak"))
		{
			System.out.println("Login successfully");
		}	
		else
		{
			System.out.println("Login failed!");	
		}

	
	}
	public static void main(String args[])
	{	
	TestLogin t=new TestLogin();
	t.logintest("hello","dipak");
	t.logintest("dipak","dipak");

	}	
}