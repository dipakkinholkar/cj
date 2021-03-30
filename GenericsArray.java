import java.util.Scanner;
class GenericsArray
{
	static String[] stud=new String[10];

	static Scanner scn=new Scanner(System.in);
	public static void main(String args[])
	{
	System.out.println("Enter Names :");
	for(int i=0; i<stud.length; i++)
	{
	stud[i]=scn.next();	
	}
	for(int i=0; i<stud.length; i++)
	{
	System.out.println("["+i+"]"+stud[i]);	
	}


	}

}