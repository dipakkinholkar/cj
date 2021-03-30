interface I
{
public void add();
}
class A implements I
{
public void add()
{
System.out.println("A add()");
}
}
class MainInt extends A implements I
{

public void add()
{
System.out.println("B add()");
}
public void sub()
{
System.out.println("B add()");
}

public static void main(String args[])
{
B b1=new B();
b1.add();
A a1=new B();
a1.add();
b1.sub();
}
}