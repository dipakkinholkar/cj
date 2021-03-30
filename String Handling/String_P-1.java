class String_P1
{
public static void main(String args[])
{
String s="abc";
String s1=s;
 
System.out.println(s);
System.out.println(s1);
System.out.println(s==s1);

String s3=new String(s1);

System.out.println(s3);



}
}