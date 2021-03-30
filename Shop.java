import java.util.Scanner;
import java.io.Console;
class Shop
{
void Login(String username,String pass)
{
if(username.contains("dipak") && pass.contains("kadam"))
{
System.out.println("Login Successful!"+"  user :"+username);
System.out.println("-------------------------------");
System.out.println("\t\t 1: New Customer");

}
else
{
System.out.println("Login Failed!");
}
}



public static void main(String args[])
	{
	Console con = System.console();
	Shop s1=new Shop();
	Scanner scn=new Scanner(System.in);
	System.out.print("enter your username :");
	String username=scn.nextLine();
	System.out.print("enter your password :"); 
        char[] ch=con.readPassword();
        String pass = String.valueOf(ch);  	
	s1.Login(username,pass);
  


}
}