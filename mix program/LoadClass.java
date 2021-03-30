class Show
{
public static int a=10;
Show()
{
System.out.println("Show");
}
}
class LoadClass
{
public static void main(String args[]) throws Exception
{
Show obj=new Show();
Class.forName("Show");
System.out.println(obj.a);
}
}