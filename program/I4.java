interface I1
{
default void m1()
{
System.out.println("I1");
}
}
interface I2 
{
default void m1()
{
System.out.println("I2");
}
}

class I3 implements I1,I2
{
public void m1()
{
I1.super.m1();
I2.super.m1();
}
}
class I4 extends I3
{
public static void main(String args[])
{
I4 i=new I4();
i.m1();
I3 i1=new I3();
i1.m1();
}
}