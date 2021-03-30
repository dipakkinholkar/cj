import java.io.*;
import java.util.Scanner;
class SwitchProgram
{
static int M(int number ,int  a,int b ,int  c)
{
switch(number)
{
case 1:
	{
	  
		
			c=a+b;
			System.out.println("ADD :"+c);
	
	}	
	break;
case 2:
	
{
	  
		
			c=a-b;
			System.out.println("SUB :"+c);

}
	break;
case 3:
{	
	  
		
			 c=a*b;
			System.out.println("MUL :"+c);
	}	
	break;
case 4:
	{
	  
		
			 c=a/b;
			System.out.println("DIV :"+c);
	}
	break;
}
return c;
}
public static void main(String args[])
{
int c=0;
SwitchProgram obj=new SwitchProgram();
Scanner scan=new Scanner(System.in);
Scanner s=new Scanner(System.in);
System.out.print("enter you first number:");
int a=s.nextInt();
System.out.print("enter you first number:");
int b=s.nextInt();
System.out.println(" 1: for ADD ");
System.out.println(" 2: for SUB");
System.out.println(" 3: for MUL");
System.out.print(" 4: for DIV");
System.out.println("");
System.out.print("enter you choise :");
int number=scan.nextInt();

M(number,a,b,c);
}
}