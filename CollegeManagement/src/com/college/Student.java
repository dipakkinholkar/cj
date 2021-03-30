package com.college;

public class Student  extends Person{

	int sid;
	String sclass;
	
	public Student(int sid,String name,String sclass,long mobno,String addr)
	{
		this.sid=sid;
		this.name=name;
		this.sclass=sclass;
		this.mobno=mobno;
		this.addr=addr;
		
	}
	public void show()
	{
		System.out.println(sid);
		System.out.println(name);
		System.out.println(sclass);
		System.out.println(mobno);
		System.out.println(addr);
		if(sclass.equals("fy"))
		{	
		System.out.println(fyfees);
		}
		else if(sclass.equals("sy"))
		{
			System.out.println(syfees);
		}
		else if(sclass.equals("ty"))
		{
			System.out.println(tyfees);
		}
			
	}
	

	
	
}
