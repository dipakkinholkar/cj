import java.io.*;
class ArrayAccess
{
public static void main(String args[]) throws Exception
{
int[] a;
a=new int[10];
a[0]=10;
a[1]=10;
a[2]=10;
a[3]=10;
a[4]=10;
a[5]=10;
for(int i=0; i<=a[10]; i++)
{
System.out.println(a[i]);
}
}
}