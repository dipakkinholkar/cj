import java.util.Scanner;
class Str_My_Method
{
 Str_My_Method(String name)
  {	
	System.out.println(name);
  }

public static void main(String args[])
{
Scanner scn=new Scanner(System.in);
String user=scn.next();
 Str_My_Method s1=new Str_My_Method(user);

System.out.println(s1.hashCode());

}
}