interface Method
{
public void add();
}
class A implements Method
{
public void add()
{
System.out.println("A add Method");
}
}

class Interface1 extends A implements Method
{
public void add()
{
System.out.println("Interface1 add Method");
}
public static void main(String args[])
{
Interface1 i1=new Interface1();

i1.add();
A a1=new A();
a1.add();
}
} 