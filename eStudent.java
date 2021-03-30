enum eStudent
{
		sname("dipak"),sclass("M.sc"),scol();
	
	String data;
	eStudent(String data)
	{
	this.data=data;
	}

	eStudent()
	{
		this.data="COCSIT";
	}
	
	public String show()
	{
	return data;
	}

	public static void main(String args[])
	{

	eStudent[] e=eStudent.values();
	
	for(eStudent es : e)
	{
	System.out.println(es+"------"+es.show());	
	System.out.println(eStudent.sname.equals(eStudent.sname));

	System.out.println(sname.hashCode());
	System.out.println(sclass.hashCode());
	System.out.println(scol.hashCode());
	System.out.println(e.hashCode()==es.hashCode());
	
	}
	}	
}