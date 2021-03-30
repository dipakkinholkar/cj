abstract class Person
{
	String name;
	String addr;

}

class Student extends Person
{
	int roll;
	

	public Student(int roll, String name , String addr)
	{
		this.roll=roll;
		this.name=name;
		this.addr=addr;	
	}
	
	public static void main(String args[])
		{
		Student s=new Student(101,"dipak","pbn");
		
		System.out.println(s.roll);
		System.out.println(s.name);
		System.out.println(s.addr);
			
	
		}



}