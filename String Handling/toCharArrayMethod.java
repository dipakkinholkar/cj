class toCharArrayMethod
{

public char[] toCharArr(String str)
{
char result[]=new char[str.length];

System.arraycopy(str,0,result,0,str.length);

return result;
}
//public void tolength(String



public static void main(String args[])
{
toCharArrayMethod obj=new toCharArrayMethod();
String s1=new String("dipak");

obj.toCharArr(s1);
}
}