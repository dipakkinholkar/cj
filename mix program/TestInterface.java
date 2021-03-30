interface Operation
{
public void add();
}
class A implements Operation
{
public void add()
{
System.out.println("A add()");
}
}
class B implements Operation
{
public void add()
{
System.out.println("B add()");
}
}

public class TestInterface extends B
{
public void add()
{
System.out.println("T add()");
}
public static void main(String args[])
{
TestInterface i1=new TestInterface();
i1.add();
B b1=new B();
b1.add();
A a1=new A();
a1.add();
}
}