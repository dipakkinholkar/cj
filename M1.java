abstract class MethodList1
{
void m1()
{
System.out.println("m1");
}
void m2();
}
abstract class M1 extends MethoList1
{
void m2()
{
System.out.println("m2");
}
public static void main(String args[])
{
M1 m=new M1();

m.m1();
m.m2();
}
} 