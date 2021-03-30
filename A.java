interface C
{
int b=20;
}
interface D
{
int d=40;
}


class A extends B implements D
{
public static void main(String args[])
{
A obj=new A();
B obj1=new B();
System.out.println("A:"+obj.a);
System.out.println("B:"+obj1.a);// by using object
System.out.println("C:"+C.b); // without creating interface obj and implements but we can access var by using Interface name. 
System.out.println("D:"+d); by using implementing interface

}

}

class B
{
int a=10;
}