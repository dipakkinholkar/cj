package com.college;

public class Library extends Person {

		 private String bkname;
		 private String issuedate;
		 private String returndate;
		 
	
	
	public Library(int sid, String name,String sclass,String bkname,String issuedate,String returndate)
	{
		
		this.sid=sid;
		this.name=name;
		this.sclass=sclass;
		this.bkname=bkname;
		this.issuedate=issuedate;
		this.returndate=returndate;

		}
	
	public void show()
	{
		System.out.println("Student id :"+sid);
		System.out.println("Student Name :"+name);
		System.out.println("Student Class :"+sclass);
		System.out.println("Book Name :"+bkname);
		System.out.println("Issue Date :"+issuedate);
		System.out.println("Return Date :"+returndate);
	}

}
