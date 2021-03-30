import java.util.List;
import java.util.ArrayList;
class Department
{
	private String name;
	private List<Student> stud;

	Department(String name , List<Student> stud)
	{
		this.name=name;
		this.stud=stud;
	}

	public List<Student> getStudent()
	{
	return stud;
	} 
}