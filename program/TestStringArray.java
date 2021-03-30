class StringArray
{
public StringArray(String[] arr)
{
for(int i=0; i<arr.length; i++)
{
System.out.println(arr[i]);
}
}
}
class TestStringArray
{
public static void main(String arg[])
{
String[] s={"dipak","kadam"};
StringArray obj=new StringArray(s);
}
}