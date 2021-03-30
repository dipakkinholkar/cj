class Bank
{
	private String name;
	
	Bank(String name)
	{
	this.name=name;
	}

	public String getBankName()
	{
	return name;
	}

}

class Employee
{
	
private String name;

	Employee(String name)
	{

		this.name=name;
	}
	
	public String getEmpName()
	{
	return name;
	}

}

class TestBankApp
{
	public static void main(String args[])
	{
	Bank b1=new Bank("SBI");

	Employee e1=new Employee("dipak");
	Employee e2=new Employee("mahesh");
	Employee e3=new Employee("atish");
	Employee e4=new Employee("ashish");
	Employee e5=new Employee("yogesh");

	System.out.println(b1.getBankName();"===="+e1.getEmpName());
		
	System.out.println(b1.getBankName()+"===="+e2.getEmpName());		

	System.out.println(b1.getBankName()+" "+e3.getEmpName());		
	System.out.println(b1.getBankName()+"===="+e4.getEmpName());		
	System.out.println(b1.getBankName()+"===="+e5.getEmpName());		
	


	}
}