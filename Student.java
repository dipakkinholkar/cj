class Student
{
	private int sid;
	private String sname;
	
	public Student(int sid, String sname)
	{
	this.sid=sid;
	this.sname=sname;
	}
	
	public String getStudent()
	{
	return "student id: "+sid+" "+"Student Name "+sname+"";
	}


}