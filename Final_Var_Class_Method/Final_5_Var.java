class A
{
final static int a=10;
final int b=1; 
int c=50;
}
class B extends A
{
final static int a=20;
final int b=2;
int c=60;

}
class Final_5_Var extends B
{
int c=70;
final static int a=30;
final int b=3;
public static void main(String args[])
{
Final_5_Var f1=new Final_5_Var();
System.out.println(f1.a); //30
System.out.println(f1.b); //3
System.out.println(f1.c); //70


A a1=new A();
System.out.println(a1.a); //10
System.out.println(a1.b); //1
System.out.println(a1.c); //50

B b1=new B();
System.out.println(b1.a); //20
System.out.println(b1.b); //2
System.out.println(b1.c); //60

}
}