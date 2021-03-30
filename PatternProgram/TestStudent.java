class Details
{
public int sid;
public String sname;
public String sclass;
}

class Student extends Details
{

	protected Student(int sid,String sname,String sclass)
	{
	System.out.println(sid);
	System.out.println(sname);
	System.out.println(sclass);
	}


}

class TestStudent{

	public static void main(String args[])
	{	
	Student s=new Student(101,"Mahesh","COCSIT");
	}
}