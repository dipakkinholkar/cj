class D
{
void m4(D d)
{
d.m1();
}
}

class A extends D
{
void m1()
{
System.out.println("m1");
}
}

class B extends D
{
void m1()
{
System.out.println("m2");
}
}

class C extends D
{
void m1()
{
System.out.println("m3");
}
}

public class TestLooseCoupling extends  D
{
public static void main(String args[])
{
D d1=new D();
d1.m4(new B());
}
} 