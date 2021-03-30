import java.io.*;
import java.util.Scanner;
class MyString
{
public MyString(char[] str)
{
str[20]='m';
System.out.println(str);
}
void MySplit(char[] str)
{
for(int i=0; i<str.length; i++)
{
	System.out.println(str[i]);
}
}
}


class StringProgram
{
public static void main(String args[])
{
//String a=new String("dipak");
//System.out.println(a);
char[] arr={'a','b','c'};
MyString obj=new MyString(arr);
obj.MySplit(arr);
}
}