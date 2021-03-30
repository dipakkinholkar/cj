import java.io.*;
import java.util.Scanner;
class  FirstClass
{
	 static int  Add(int a,int b)
		{
		int c,d;
		c=a;
		d=b;
		System.out.print("c"+c);
		System.out.print("d"+d);	
		return 0;
		}
	
}

public class SecondClass extends FirstClass
	{
	public static void main(String args[])
		{
		Scanner getvalue=new Scanner(System.in);
		System.out.print("enter value for a :");
		int a=getvalue.nextInt();
		System.out.print("enter value for b :");
		int b=getvalue.nextInt();
		FirstClass.Add(a,b);
		
		}
}
