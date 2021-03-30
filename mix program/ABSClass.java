abstract class ABS
{
abstract void First();

void m2()
{
System.out.println("m1");
}

}
class Child extends ABS
{

void First()
{
System.out.println("Child:m1");
}

}
class ABSClass
{
public static void main(String args[])
{
Child c1=new Child();

c1.m2();
c1.First();
}
}