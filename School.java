class School
{
	public static void main(String args[])
	{
	
	Student s=new Student(101,"dd");
	 
	String details=s.getStudent();	

	if(details!=null)	
	System.out.print(details);
	else
	System.out.print("Record not Found !");

	}

}