import java.io.*;
import java.util.Scanner;
class Power
{
public static void main(String args[])
{
Scanner scan=new Scanner();
System.out.print("enter power of a number");
int pow=scan.nextInt(System.in);

System.out.print("enter  number for power");
int number=scan.nextInt(System.in);
for(int i=number; i<=pow; i++)
{

int pwr=number*pow;


}

System.out.println(pwr);


}

}