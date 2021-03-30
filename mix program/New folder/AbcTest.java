abstract class A
{
public static void show()
{
System.out.println("show");
}
}
class AbcTest extends A
{
public static void show()
{
System.out.println("AbcTest:show");
}
public static void main(String args[])
{
AbcTest a=new AbcTest();
a.show();
}
}