




class A
{
    A(int a)
   {
	this(20,30);
    System.out.println("super class A:"+a);
   }
    A(int  b,int c)
	{
	System.out.println("Super Class A:"+b+" B:"+c);
	}
}
class B extends A
{
        B()
	{
	super(10);
	}
}
class C extends B
{
  C()
  {
   super();
  }
}
class TestABC
{
public static void main(String args[])
{
C c1=new C();

}
}