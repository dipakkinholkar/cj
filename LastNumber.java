import java.io.*;
import java.util.Scanner;
class LastNumber
{

public static int cube(int number)
{
for(int i=1; i<=3; i++)
{
result=result*number;
}
System.out.println("result="+result);
return result;
}



public static void main(String args[])
{

Scanner value=new Scanner(System.in);


System.out.print("Now enter a number:");
int number=value.nextInt();
cube(number);

}
}
