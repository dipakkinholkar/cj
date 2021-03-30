interface A
{
int a=20;
}
class B
{
int b=10;
}
class Interface_1 extends I implements A
{
public static void main(String args[])
{

Interface_1 i1=new Interface_1();
System.out.println(i1.a);//20
System.out.println(i1.b);//10

B b1=new B();
System.out.println(b1.b);//10




/*
we can create object of or instantiate of interface
A a1=new A();
System.out.println(a1.a);
*/

}
}