import java.util.Scanner;
class BankApp
{
public static void main(String args[])
{

Scanner scn=new Scanner(System.in);
System.out.println( "Enter Bank Name: ");
String bankname=scn.next();
LoanFactory lf=new LoanFactory();
	
	Loan l=lf.getBankName(bankname);

	l.show();


}


}