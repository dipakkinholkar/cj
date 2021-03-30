import java.io.*;
public class  UseMethod
{
 static int Add(int a,int b)
{
int c=a+b;
return c;
}
public static void main(String args[])
{
int i=UseMethod.Add(10,20);
System.out.println(i);
}
}