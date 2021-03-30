import java.util.Scanner;
class UserServer
{
	public static void main(String args[]) throws Exception
	{
	Scanner scn=new Scanner(System.in);
	TataServer ts=new TataServer();
	TataProject.welcome();
	System.out.println("Enter ServerName :");
	
	Class cls=Class.forName(scn.nextLine());
	Object obj=cls.newInstance();
	ts.tatacon((TataProject)obj);




	}


}