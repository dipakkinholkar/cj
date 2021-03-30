// create empty String

class CreateEmptyString
{
	
	public static void main(String args[])
	{

String str=new String();
System.out.println(str); // not printing anything.
System.out.println(str.length()); //0
if(str!=null)
System.out.println("String created");

str="hello";

System.out.println(str); // hello
System.out.println(str.length()); // 5

}

}