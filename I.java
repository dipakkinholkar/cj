class A
{
A(int a,int c)
{
this.(a);
System.out.println(+c);
}
A(int a)
{
System.out.println("a="+a);
}
}
class B extends A
{
B(int a,int b,int d)
{
this(a,b,c);
System.out.println("d="+d);
}
B(int a,int b,int c)
{
super.(a,b);
System.out.println("c="+d);
}
}
class I
{
public static void main(String args[])
{
A obj=new A(10,20,30,40);

}

}