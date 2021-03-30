class EmpRecord implements Prototype
{
private int eid;
private String ename;
private double esalary;

	public EmpRecord()
	{
		
		System.out.println("eid"+"\t"+"ename"+"\t"+"esalary");
		System.out.print("------------------------------\n");	
		
	}

	public EmpRecord(int eid,String ename,double esalary)
	{
			this();
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}

	public void ShowRecord()
	{
		System.out.println(eid+"\t"+ename+"\t"+esalary);
	}

	public Prototype getClone()
	{

	return new EmpRecord(eid,ename,esalary);
	}




}