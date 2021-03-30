import java.io.*;
class  MethodDeclaration
{ 
public static void ADD(int a,int b)
{
int c=a+b;
System.out.print(c+"\n");
}
public static void SUB(int a, int b)
{
int c=a+b;
System.out.print(c);
}
public static void main(String args[])
{

for(int i=0; i<=10; i++)
{
ADD(10,20);
SUB(10,20);
}


}
}