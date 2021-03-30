class String_M
{
public static void main(String args[])
{

String s1="dipak";
String s2="DIPAK KADAM";
char i=s1.charAt(0);

System.out.println("s1:length:"+s1.length());
System.out.println("s1:toLower:"+s1.toLowerCase());
System.out.println("s1:toUpper:"+s1.toUpperCase());

System.out.println("s2:length:"+s2.length());
System.out.println("s2:toLower:"+s2.toLowerCase());
System.out.println("s2:toUpper:"+s2.toUpperCase());

System.out.println("s1:tocharAt():"+s1.charAt(0));
System.out.println("i:"+i);

System.out.println(s1.contains("dipak")); // true
System.out.println(s1.contains("kadam")); // false


System.out.println(s2.contains("KADAM"));

boolean b=s1.startsWith("dip");
System.out.println(b);

String s4="dipak kadam is great programmer";

System.out.println(s4.startsWith("dipak")); // true
System.out.println(s4.startsWith("is")); // false

System.out.println(s4.indexOf('k')); // 4
System.out.println(s4.indexOf('p')); // 2
System.out.println(s4.indexOf("d")); // 0
System.out.println(s4.indexOf("is")); // 12 only checks i character of is string.
System.out.println(s4.indexOf("programmer")); // 21 .indexOf checks only first character in String or given single character.






}
}