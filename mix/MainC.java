class Test2
{
Test2()
{
System.out.println("Test2");
}
public static void main(int args[])
{
System.out.println("main");
}
}
class MainC
{
public static void main(String args[])
{
Test2 obj=new Test2();
obj.main();
}
}