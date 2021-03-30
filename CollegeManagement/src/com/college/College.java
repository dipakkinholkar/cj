package com.college;

public class College extends Person {
	
	double fees;
	
	
	public College(int sid,String name,String sclass,long mobno,String addr)
	{
	this.sid=sid;
	this.name=name;
	this.sclass=sclass;
	this.mobno=mobno;
	this.addr=addr;
	this.fees=fees;
		
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
