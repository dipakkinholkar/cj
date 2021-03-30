class Univercity
{
	class Department
	{
		public void physics()
		{
		System.out.println("physics");
		}
		
		
		public void chemistry()
		{
		System.out.println("chemistry");
		}

		public void biology()
		{
		System.out.println("Biology");
		}

		public void mathmatics()
		{
		System.out.println("mathmatics");
		}

		public void computer()
		{
		System.out.println("computer");
		}
	}

public static void main(String args[])
	{

// optional method	new Univercity().new Department().physics();
		
	Univercity u=new Univercity();
	
	Univercity.Department d=u.new Department();
	
	d.physics();
	d.mathmatics();
	d.chemistry();
	d.biology();
	d.computer();
	
	System.out.println(u.getClass().getName());
	System.out.println(d.getClass().getName());

		
	}


}