interface My_Copy
{
public void fname(String ffname);
public void mname(String mmname);
public void lname(String llname);
}

interface My_Methods   //extends My_Copy
{
public void fname(String ffname);
public void mname(String mmname);
public void lname(String llname);
}

class Test_Interface2 implements My_Copy
	{
	
	public void fname(String ffname)
	{
	System.out.println("Interface2");
	System.out.println(ffname);
	}
	
	public void mname(String mmname)
	{
	System.out.println(mmname);
	}
	
	public void lname(String llname)
	{
	System.out.println(llname);
	}
	
}
public class Test_Interface extends Test_Interface2 implements My_Methods
{
	public void fname(String ffname)
	{
		System.out.println(ffname);
	}
	public void mname(String mmname)
	{
		System.out.println(mmname);
	}
	
	public void lname(String llname)
	{
		System.out.println(llname);
	}

public static void main(String args[])
{
Test_Interface t1=new Test_Interface();
Test_Interface2 t2=new Test_Interface2();

t1.fname("Dipak");
t1.mname("Maroti");
t1.lname("Kadam");

t2.fname("Mahesh");
t2.mname("Sharekar");
t2.lname("Kulkarni");

}
}