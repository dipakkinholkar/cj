import java.io.*;
import java.util.Scanner;

class StudentRegistration
{
private int sno=101;
private String sname="DIPAK";
private String mobno="7057807659";
protected String emailid="dipak@gmail.com";
protected String password="dipak";
public void display()
{
System.out.println("sno:"+sno);
System.out.println("sname:"+sname);
System.out.println("mobno:"+mobno);
}
}

class StudLogin extends StudentRegistration
{
public static void main(String args[])
	{
	StudentRegistration s1=new StudentRegistration();
	Scanner scn=new Scanner(System.in);
	System.out.print("enter username:");
	String email=scn.next();
	System.out.print("enter password:");
	String pwd=scn.next();

	if(email.equals(s1.emailid) && pwd.equals(s1.password))
		{System.out.println("login successfully:");
		s1.display();}		
	else
		System.out.println("login failed!:");

			
	}
}