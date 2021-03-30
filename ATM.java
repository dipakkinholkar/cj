import java.io.*;
import java.util.Scanner;

class Operation
{
//static int balance=1000;
int deposit(int a,int b)
{
System.out.println(balance);
return 0;
}

int sub(int a,int b)
{
System.out.println(balance);

int c=a-b;

System.out.println("sub= :"+ c);
return 0;
}

int mul(int a,int b)
{
int c=a*b;
System.out.println("mul= :"+c);
return 0;
}

int div(int a,int b)
{
System.exit(0);
return 0;
}
}

class ATM extends Operation
{
public static void main(String args[])
{
Operation o=new Operation();
Scanner obj=new Scanner(System.in);
System.out.print("Enter value for a :");
System.out.print("\n");
int p=obj.nextInt();
System.out.print("Enter value for b :");
System.out.print("\n");
int q=obj.nextInt();

System.out.println("1 : for Cash_Deposit");
System.out.println("2 : for Cash_Withdraw");
System.out.println("3 : for Mini_Statement");
System.out.println("4 : for Exit");

System.out.print("Enter your choice :");
System.out.print("\n");
int i=obj.nextInt();
switch(i)
{
case 1:
{ 
o.deposit(p,q);break;
}
case 2:
{
o.sub(p,q);break;
}
case 3:
{
o.mul(p,q);break;
}
case 4:
{
o.div(p,q);break;
}
}
}
}