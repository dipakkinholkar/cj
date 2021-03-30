interface FirstInterface
{
public void m1();
}
interface SecondInterface
{
public void m1();
}

class C implements FirstInterface,SecondInterface
{
public void m1()
{
System.out.println("m1");
}
}
class D extends C
{
public void m1()
{
//super.m1();
System.out.println("D:m1");
}
public static void main(String args[])
{
D d=new D();
d.m1();

}
}