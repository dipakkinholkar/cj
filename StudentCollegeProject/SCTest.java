import java.util.List;
import java.util.ArrayList;
class SCTest
{

	public static void main(String args[])
	{
					
	Student s1=new Student(101,"dipak","cse");
	Student s2=new Student(102,"mahesh","cse");
	Student s3=new Student(103,"atish","eee");
	Student s4=new Student(104,"patil","eee");
	
	List<Student> cses=new ArrayList<Student>();
	
		cses.add(s1);
		cses.add(s2);


	List<Student> eees=new ArrayList<Student>();
		
		eees.add(s3);
		eees.add(s4);

	Department cse=new Department("cse",cses);
		
	Department eee=new Department("eee",eees);

	List<Department> d=new ArrayList<Department>();
	
	d.add(cse);
	d.add(eee);


	Institute i=new Institute("BITS", d);
	
	System.out.println("Total no of Institute");

	System.out.println(i.getTotalStudent());
	


	}






}