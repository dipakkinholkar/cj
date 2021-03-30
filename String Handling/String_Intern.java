class String_Intern
{
public static void main(String args[])
{
String s1="dipak";
String s2=s1.intern();

System.out.println(s1==s2);// true  comparing memory locations

System.out.println(s1.equals(s2)); // true comparing values


String s3=s1.concat(s2);
System.out.println(s3);

//System.out.println(s3==s1.equals(s2)); // error

System.out.println(s3.equals(s1.equals(s2))); // false
System.out.println(s3.equals(s1.concat(s2))); // true

}
}