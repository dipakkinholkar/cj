class String_Return
{

String Int(int str)
{
return ""+str;
}
public static void main(String args[])
{
String_Return s1=new String_Return();
Integer i=new Integer(10);
System.out.println(i);
String str=s1.Int(i);
System.out.println(str); // error

}
}