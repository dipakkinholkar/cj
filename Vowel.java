import java.util.Scanner;
class Vowel
{
public static void main(String args[])
{
Scanner scn=new Scanner(System.in);
System.out.print("enter Character :");
char c=scn.next().charAt(0);


if(c=='a'||c=='e'||c=='o'||c=='u'||c=='i')
{
System.out.println(c+":is a vowel");
}
 else if(c=='A'||c=='E'||c=='O'||c=='U'||c=='I')
{
System.out.println(c+":is a vowel");
}

else
{
System.out.println(c+":is not a vowel, it's a Consonant");
}
 

}
}