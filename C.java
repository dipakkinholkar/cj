interface A
{
int a=10;
}

interface AA
{
int e=10;
}

class B
{
int b=20;
}


class C extends B implements A,AA
{
int d=a+b;
public static void main(String args[])
{
C obj=new C();

System.out.println("a"+a);
System.out.println("e"+e);
System.out.println(obj.d);
}
}
