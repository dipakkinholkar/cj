import java.io.*;
import java.util.Scanner;
class StringSearching
{
public static void main(String args[])
{
Scanner getinput=new Scanner(System.in);
String paragraph=getinput.nextLine();
System.out.println(paragraph);
if(paragraph.equals("dipak"))
{
System.out.println("match found");
}
}
}