import java.util.Scanner;

class AppTest
{
 public void PassValue(int p ,int q)
	{
	
	Add a=new Add(p,q);
	Sub s=new Sub(p,q);
	Mul m=new Mul(p,q);
	Div d=new Div(p,q);
	
	}


public static void main(String args[])
{
AppTest obj=new AppTest();
Scanner scn=new Scanner(System.in);
System.out.print("Enter First Number:");
int x=scn.nextInt();
System.out.print("Enter Second Number:");
int y=scn.nextInt();
obj.PassValue(x,y);
}
}