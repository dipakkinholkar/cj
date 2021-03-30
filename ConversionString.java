import java.util.Scanner;
class ConversionString
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String name=s.nextLine();

String b=new String(name);
String c=b.toUpperCase();

System.out.println(c);

String d=new String(c);
String e=d.toLowerCase();

System.out.println(e);
s



}

}