import java.util.List;
import java.util.ArrayList;
class Institute
{
	private String name;
	private List<Department> depart;

	Institute(String name , List<Department> depart)
	{
	this.name=name;
	this.depart=depart;
	}
	
	public int getTotalStudent()
	{
		int no=0;
		List<Student> stud;

		for(Department dept: depart)
		{
			
			stud=dept.getStudent();
			
		 for(Student s : stud)
			{
				no +=1;	
			}

		}
		return no;
	}



}