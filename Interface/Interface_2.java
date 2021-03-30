interface A
{
void m1();
void m2();
}
class B
{
public void m1()
{
System.out.println("m1() called in B class");
}
}
class Interface_2 extends B implements A
{
public void m2()
{
System.out.println("m2() method called");
}



public static void main(String args[])
{

Interface_2 i1=new Interface_2();
i1.m1(); // m1() method called.
i1.m2();

B b1=new B();
b1.m1();
//b1.m2();


}
}