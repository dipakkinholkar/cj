class Parent
{
public void m1()
{
System.out.println("Parent");
}

}
class Child extends Parent
{
public void m2()
{
System.out.println("child");
}

}

class ParentChild
{
Parent p=new Parent();
p.m1();
}