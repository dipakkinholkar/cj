import java.io.*;
import java.util.Scanner;
class Take_Input
{
void Call()
{
Scanner s=new Scanner(System.in);
System.out.print("\t\t\t\t\t\tenter value for a :");
int a=s.nextInt();
System.out.print("\n\t\t\t\t\t\tenter value for b :");
int b=s.nextInt();
System.out.println("\t\t\t\t\t\tCalling...");
Add(a,b);
Add(a,b);
}
int Add(int a,int b)
{
int c=a+b;
System.out.println("\t\t\t\t\t\tadd="+c);
Scanner s=new Scanner(System.in);
System.out.println("\t\t\t\t\t\tDo you want to Exit press anything except 1");
int i=s.nextInt();

if(i==1)
{
Call();
}
else
{
System.exit(0);
}
return c;
}
public static void main(String args[])
{

Take_Input obj=new Take_Input();
obj.Call();
}
}