class String_toString
{
void String_Convert(String no)
{
System.out.println("String:"+no);
}
void Int(int i)
{
System.out.println("Integer:"+i);
} 
public static  void main(String args[])
{
String_toString s1=new String_toString();

Integer i=new Integer(10);
String no=Integer.toString(i);
s1.String_Convert(no);
s1.Int(i);
}
}