import java.util.Scanner;
class PrototypeTest
{
	public static void main(String args[])
	{
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter Emp Id :");
	int eid=scn.nextInt();
	System.out.print("Enter Emp Name :");
	String ename=scn.next();
	System.out.print("Enter Emp Salary :");
	 double esalary=scn.nextDouble();
		
	EmpRecord emp=new EmpRecord(eid,ename,esalary);
	emp.ShowRecord();

	EmpRecord emp1=(EmpRecord)emp.getClone();
	emp1.ShowRecord();
	
	
		
	
		

	}

}