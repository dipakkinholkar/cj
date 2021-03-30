class Bank
{
	private String name;
	
	Bank(String name)
	{
		this.name=name;
	}

	public String getBankName()
	{
	return this.name;
	}
}

class Emp
{
	private String name;
	
	Emp(String name)
	{
	this.name=name;	
	}
	
	public String getEmpName()
	{
	return this.name;
	}
}


class Association
{
	public static void main(String argsp[])
	{
		Bank b=new Bank("SBI");
		Emp e=new Emp("Dipak");
		
		System.out.println(e.getEmpName()+""+b.getBankName());
	}
}
