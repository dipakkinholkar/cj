import java.util.Date;
import java.util.Scanner;
//import java.io.Console;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class Bank_App
	{
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	
	double bal=100000.0d;	
	void Login(String ano,String pass)
	{
		
	String acc_no="sbi";
	String pwd="sbi";
	  if(acc_no.equals(ano) && pwd.equals(pass)){
		  
		System.out.println("\n\t\t\t\t\t\t\tWelcome to SBI Online Banking\n");
		
		show();
		}
	   else{
		System.out.println("\t\t\t\t\t\t\tInvalid Username or Password!");
		}		
	}

	
	void show()
	{		
	Scanner scn=new Scanner(System.in);
	System.out.print("\n");
	System.out.print("\t\t\t\t\t\t\t____________________________\n");
	System.out.println("\t\t\t\t\t\t\t1: Check Account Balance");
	System.out.print("\t\t\t\t\t\t\t____________________________\n");
	System.out.println("\t\t\t\t\t\t\t2: Deposit Money ");
	System.out.print("\t\t\t\t\t\t\t____________________________\n");
	System.out.println("\t\t\t\t\t\t\t3: Withdraw Money");
	System.out.print("\t\t\t\t\t\t\t____________________________\n");
	System.out.println("\t\t\t\t\t\t\t4: exit");
	System.out.println("");
	System.out.print("\t\t\t\t\t\t\tEnter Your Choice :");
	int i=scn.nextInt();
	switch(i)
		{
		case 1:
		balance(bal);break;
		case 2:
		Scanner dep=new Scanner(System.in);
		System.out.print("\t\t\t\t\t\t\tEnter Value for Deposit Money:");
		double depo=dep.nextDouble();
		deposit(depo);break;
		case 3:
		Scanner scn4=new Scanner(System.in);
		System.out.print("\t\t\t\t\t\t\tEnter Amount for Withdraw :");
		double with=scn4.nextDouble();
		withdraw(with);break;
		case 4:
		exit();break;
		default:
			System.out.println("\t\t\t\t\t\t\tInvalid Choice Try Again!");
		show();
		}
	
	}
	double balance(double bal)
		{
		System.out.println("\t\t\t\t\t\t\tAccount Available Balance is :"+bal);
		show();
		return bal;
		}
	
	void exit()
		{
		Scanner scn5=new Scanner(System.in);
		System.out.print("\t\t\t\t\t\t\tReally Do You want to Exit type(yes/no):");
		String flag=scn5.next();
		if(flag.equals("yes"))
		{
			System.out.println("\t\t\t\t\t\t\tThanking for Using our Services !");
			System.exit(0);	
		}
			if(flag.equals("no"))
		{
				
			show();	
		}
		}
	double withdraw(double with)
		{
		if(bal>=with){
		bal=bal-with;
		System.out.print("\t\t\t\t\t\t\tAvailable Balance :"+bal);
		show();
		return bal;
		}	
		else
		{
		System.out.println("\t\t\t\t\t\t\tSufficience Balance Not Available!");
		show();
		return 0;
		}
		}		
	double deposit(double depo)
		{
		System.out.println("\t\t\t\t\t\t\tYour Money is Deposited :"+depo);
		bal=bal+depo;
		show();
		return bal;
		}
	 	

public static void main(String args[]) throws IOException
{
	Scanner scn=new Scanner(System.in);
	Date date_obj=new Date();
	System.out.println("\t\t\t\t\t\t\t\t\t"+date_obj);

	/*Console con=System.console();
	if(con==null){
		System.out.print("No Console Available !");	
	}*/
	

System.out.println("\t\t\t\t\t\t\t--------------------------");
System.out.print("\t\t\t\t\t\t\tEnter Your Username:");
String ano=scn.next();

System.out.print("\t\t\t\t\t\t\tEnter Your Password:");
String pass=scn.next();

/*char[] ch=con.readPassword();
System.out.print("\t\t\t\t\t\t\t--------------------------\n"); 
String pass=String.valueOf(ch);
*/

Bank_App obj=new Bank_App();
obj.Login(ano,pass);
}
}

