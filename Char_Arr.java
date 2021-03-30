import java.util.Scanner;
import java.lang.String;
class Char_Arr
{
public static void main(String args[])
{

char[] str={'d','i','p','a','k'};

System.out.println(str[0]); // d
System.out.println(str);    // dipak

Scanner scn=new Scanner(System.in);
String d=scn.next(); 	// input dipak
char[] s=d.toCharArray(); //convert into char array {'d','i','p','a','k'}
for(int i=0; i<=s.length; i++) //for printing char array values.
{
System.out.println(i+":"+s[i]);// indexValue(0 to 5) and s[i]={'d','i','p','a','k'}; 
}


}
}