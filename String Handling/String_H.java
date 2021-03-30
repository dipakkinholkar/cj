class String_H
{
public static void main(String args[])
{
String s1="dipak";
System.out.println(s1);
System.out.println("s1:"+s1.hashCode()); // display s1 ref var hashcode
String s2="dipak";
System.out.println("s2:"+s2.hashCode()); // display s2 ref var hashcode

System.out.println(s1.hashCode()==s2.hashCode());// true
System.out.println(s1==s2); //true
s2="Dipak";
System.out.println(s1==s2); // false

String s3="";
System.out.println(s3.isEmpty()==true); // true
System.out.println(s3.isEmpty()); // true
}
}