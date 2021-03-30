import java.util.Scanner;

interface String_U
{
public void Calculate(); 
}

class String_Username implements String_U
{
	public void Calculate()
	{	
	
		char[] id={'d','i','p','a','k'};		
			
		for(int i=0; i<=id[i]; i++)
			{
			System.out.println(i);
			}
	}
	void isEmpty(String uname)
	{	
		if(uname.isEmpty()) //isEmpty method
		{
			System.out.println("username is empty");
		}
		else if(uname!=null)
		{
			System.out.println("username is not null:"+uname);      	
		}
		
			
	}

	
	
	
public static void main(String args[])
	{
	String_Username u1=new String_Username();
	String username=null;
	Scanner scn=new Scanner(System.in);
	username=scn.nextLine();
	u1.isEmpty(username);
	u1.Calculate();
	}	
}