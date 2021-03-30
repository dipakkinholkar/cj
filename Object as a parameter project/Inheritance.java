class Aclass
{

Aclass(int a,int b)
{	
this(a);
System.out.println("b"+b);
}

Aclass(int a)
{
System.out.println("a"+a);
}
}

class Bclass extends Aclass
{
Bclass(int a,int b,int c,int d)
{
 this(a,b,c);
System.out.println("d"+d);
}
Bclass(int a,int b,int c)
{
super(a,b);
System.out.println("c"+c);
}
}
class Inheritance
{
public static void main(String args[])
{
Bclass obj=new Bclass(10,20,30,40);
}
}