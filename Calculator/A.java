interface AA
{
public void m1();
}
interface AA2 extends AA
{
public void m1();
}
class A
{
public static int  m1()
{
return m1();
}
public static void main(String args[])
{
System.out.println("hello");
System.out.println(A.m1());
}
}